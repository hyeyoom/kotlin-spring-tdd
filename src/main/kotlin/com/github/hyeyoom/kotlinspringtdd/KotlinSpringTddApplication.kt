package com.github.hyeyoom.kotlinspringtdd

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringTddApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpringTddApplication>(*args)
}