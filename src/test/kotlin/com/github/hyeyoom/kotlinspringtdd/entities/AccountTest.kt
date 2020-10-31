package com.github.hyeyoom.kotlinspringtdd.entities

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class AccountTest {

    @DisplayName("옳은 패스워드가 파라미터로 전달되면 true를 반환함")
    @Test
    fun whenRightPasswordPassedThroughParameter_thenReturnTrue() {
        val rightPassword = "1234";

        val account = Account(1, "test@test.com", "1234")
        val result = account.authenticate(rightPassword);
        Assertions.assertEquals(true, result)
    }
}