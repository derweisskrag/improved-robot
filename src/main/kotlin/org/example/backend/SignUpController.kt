package org.example.backend

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.ui.Model
import org.springframework.ui.set

/**
 * This is the SignUp page of the BackendApp
 *
 *
 */

@Controller
class SignUpController {

    @GetMapping("/signup")
    fun signup(model: Model): String {

        // pass the user prop
        // reuse this
        // TODO: Think how to make HOC.
        model["user"] = "Guest"

        return "signup"
    }

}