package com.artemas.springapplicationeventsdemo.listener

import com.artemas.springapplicationeventsdemo.event.GreetingEvent
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component

@Component
class GreetingListener {
    val logger: Logger = LoggerFactory.getLogger(GreetingListener::class.java)
    
    @EventListener
    @Async
    fun onGreetingEventCreated(greetingEvent: GreetingEvent) {
        logger.info("I received a greeting event! : $greetingEvent")
    }
}