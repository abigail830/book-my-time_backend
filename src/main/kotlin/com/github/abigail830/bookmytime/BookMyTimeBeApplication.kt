package com.github.abigail830.bookmytime

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.github.abigail830.bookmytime"])
class BookMyTimeBeApplication

fun main(args: Array<String>) {
	runApplication<BookMyTimeBeApplication>(*args)
}
