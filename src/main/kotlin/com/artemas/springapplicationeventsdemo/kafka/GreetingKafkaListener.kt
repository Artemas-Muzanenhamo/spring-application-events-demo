package com.artemas.springapplicationeventsdemo.kafka

import com.artemas.springapplicationeventsdemo.event.GreetingEvent
import org.apache.kafka.clients.consumer.ConsumerRecord
import org.slf4j.Logger
import org.springframework.context.ApplicationEventPublisher
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class GreetingKafkaListener(
    val applicationEventPublisher: ApplicationEventPublisher,
    val logger: Logger
) {
    @KafkaListener(topics = ["greeting-topic"], groupId = "greetings-service")
    fun processGreeting(message: ConsumerRecord<String, String?>) {
        logger.info("RECIEVED MESSAGE: ${message.value()}")

        applicationEventPublisher.publishEvent(GreetingEvent(message.value()))
        
        logger.info("PUBLISHED KAFKA MESSAGE TO INTERNAL EVENT")
    }
}