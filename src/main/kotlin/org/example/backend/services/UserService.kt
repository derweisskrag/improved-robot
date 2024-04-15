package org.example.backend.services

import org.example.backend.entities.User
import org.example.backend.repositories.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    fun findByUsername(username: String) = userRepository.findByUsername(username)

    fun save(user: User): User {
        return userRepository.save(user)
    }
}
