package org.example.backend.controllers

import org.example.backend.entities.User
import org.example.backend.security.JwtUtil
import org.example.backend.services.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService, private val jwtUtil: JwtUtil) {

    @GetMapping("/{username}")
    fun getUser(@PathVariable username: String) = userService.findByUsername(username)


    @PostMapping("/register")
    fun registerUser(@RequestBody newUser: User): ResponseEntity<User> {
        // check if the user with the same username already exists
        val existingUser = userService.findByUsername(newUser.username)

        if (existingUser != null){
            // if the user already exists, raise exception
            return ResponseEntity.status(HttpStatus.CONFLICT).build()
        }

        // save the user
        val savedUser = userService.save(newUser)

        return ResponseEntity.status(HttpStatus.CREATED).body(newUser)
    }

    @PostMapping("/login")
    fun loginUser(@RequestBody user: User): ResponseEntity<String>{
        val existingUser = userService.findByUsername(user.username)

        if (existingUser == null || existingUser.password != user.password) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build()
        }

        val token = jwtUtil.generateToken(user.username)

        return ResponseEntity.ok(token)
    }
}
