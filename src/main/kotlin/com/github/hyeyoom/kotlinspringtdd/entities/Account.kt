package com.github.hyeyoom.kotlinspringtdd.entities

import java.util.*

data class Account(
        var id: Long? = null,

        var mail: String,

        var password: String,

        val aid: String = UUID.randomUUID().toString()
) {
    fun authenticate(req: String): Boolean {
        return req == password
    }
}