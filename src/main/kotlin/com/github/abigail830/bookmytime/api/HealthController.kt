package com.github.abigail830.bookmytime.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/health")
class HealthController {

    @GetMapping("")
    fun hello() = "Hello!";

    @GetMapping("/{name}")
    fun helloByName(@PathVariable name: String) = "Hello $name!";
}