package com.artemas.springapplicationeventsdemo.listener

import com.artemas.springapplicationeventsdemo.event.GreetingEvent
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component

@Component
class Greeting3Listener {
    val logger: Logger = LoggerFactory.getLogger(Greeting3Listener::class.java)

    @EventListener
    @Async
    fun onGreetingEventCreated(greetingEvent: GreetingEvent) {
        logger.info("Greeting3Listener: I received a greeting event! : ${greetingEvent.source}")
    }
}