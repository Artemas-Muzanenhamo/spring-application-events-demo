package com.artemas.springapplicationeventsdemo.web

import com.artemas.springapplicationeventsdemo.service.GreetingService
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatus.CREATED
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController(
    val greetingService: GreetingService
) {
    @ResponseStatus(CREATED)
    @PostMapping("/greet")
    fun sendGreeting(@RequestBody greeting: String) {
        greetingService.send(greeting)
    }
}