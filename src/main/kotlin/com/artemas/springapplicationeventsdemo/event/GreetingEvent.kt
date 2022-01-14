package com.artemas.springapplicationeventsdemo.event

import org.springframework.context.ApplicationEvent

class GreetingEvent(source: String?) : ApplicationEvent(source!!)