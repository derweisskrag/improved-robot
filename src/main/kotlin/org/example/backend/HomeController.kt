package org.example.backend

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.ui.Model
import org.springframework.ui.set

/**
 * This is the Home page of the BackendApp
 *
 *
 */

@Controller
class HtmlController {

    @GetMapping("/")
    fun home(model: Model): String {
        model["message"] = "Home"

        // pass the user prop
        model["user"] = "Guest"

        return "home"
    }

}