package com.artemas.springapplicationeventsdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync

@SpringBootApplication
@EnableAsync
class SpringApplicationEventsDemoApplication

fun main(args: Array<String>) {
	runApplication<SpringApplicationEventsDemoApplication>(*args)
}
