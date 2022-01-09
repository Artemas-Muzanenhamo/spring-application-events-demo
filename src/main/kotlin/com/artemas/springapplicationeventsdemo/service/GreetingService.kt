package com.artemas.springapplicationeventsdemo.service

import com.artemas.springapplicationeventsdemo.event.GreetingEvent
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service

@Service
class GreetingService(
    val applicationEventPublisher: ApplicationEventPublisher
) {
    val logger: Logger = LoggerFactory.getLogger(GreetingService::class.java)
    
    fun send(greeting: String) {
        logger.info("Greeting: $greeting is about to be published")
        applicationEventPublisher.publishEvent(GreetingEvent(greeting))
        logger.info("Greeting: $greeting was published")
    }
}