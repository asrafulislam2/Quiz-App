package com.quizapp

//import org.junit.Assert.*
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class MainActivityTest {
    @Test
    fun `detected String Username Input returns true`() {
        val result = MainActivity.usernameInput.validateUsername(
             username = "Anything!"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `detected Blank Username Input returns false`() {
        val result = MainActivity.usernameInput.validateUsername(
            username = ""
        )
        assertThat(result).isFalse()
    }

}