package com.test.openai.openai_test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class OpenaiTestApplication

fun main(args: Array<String>) {
	runApplication<OpenaiTestApplication>(*args)
}
