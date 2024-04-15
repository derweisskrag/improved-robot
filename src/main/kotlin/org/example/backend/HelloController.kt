package org.example.backend

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

/**
 * The test API call: hello route
 */


@Controller
class HelloController {
    @RequestMapping(value = ["/hello"], method = [RequestMethod.GET])
    @ResponseBody
    fun hello(): String{
        return "Hello, world!"
    }
}