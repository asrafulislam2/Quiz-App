package com.quizapp

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayInputStream
import java.util.*

class ConstantsTest {


    @Test
    fun `check correctness of answer 1`() {
        var mQuestionsList: ArrayList<Question>? = null
        mQuestionsList = Constants.getQuestions()
        val question = mQuestionsList?.get(0)
        if (question != null) {
            assertEquals(question.correctAnswer, 2)
        }
    }

    @Test
    fun `check correctness of answer 2`() {
        var mQuestionsList: ArrayList<Question>? = null
        mQuestionsList = Constants.getQuestions()
        val question = mQuestionsList?.get(1)
        if (question != null) {
            assertEquals(question.correctAnswer, 3)
        }
    }

    @Test
    fun `check correctness of answer 3`() {
        var mQuestionsList: ArrayList<Question>? = null
        mQuestionsList = Constants.getQuestions()
        val question = mQuestionsList?.get(2)
        if (question != null) {
            assertEquals(question.correctAnswer, 1)
        }
    }

    @Test
    fun `check correctness of answer 4`() {
        var mQuestionsList: ArrayList<Question>? = null
        mQuestionsList = Constants.getQuestions()
        val question = mQuestionsList?.get(3)
        if (question != null) {
            assertEquals(question.correctAnswer, 2)
        }
    }

    @Test
    fun `check correctness of answer 5`() {
        var mQuestionsList: ArrayList<Question>? = null
        mQuestionsList = Constants.getQuestions()
        val question = mQuestionsList?.get(4)
        if (question != null) {
            assertEquals(question.correctAnswer, 3)
        }
    }

    @Test
    fun `check correctness of answer 6`() {
        var mQuestionsList: ArrayList<Question>? = null
        mQuestionsList = Constants.getQuestions()
        val question = mQuestionsList?.get(5)
        if (question != null) {
            assertEquals(question.correctAnswer, 4)
        }
    }

    @Test
    fun `check correctness of answer 7`() {
        var mQuestionsList: ArrayList<Question>? = null
        mQuestionsList = Constants.getQuestions()
        val question = mQuestionsList?.get(6)
        if (question != null) {
            assertEquals(question.correctAnswer, 3)
        }
    }

    @Test
    fun `check correctness of answer 8`() {
        var mQuestionsList: ArrayList<Question>? = null
        mQuestionsList = Constants.getQuestions()
        val question = mQuestionsList?.get(7)
        if (question != null) {
            assertEquals(question.correctAnswer, 1)
        }
    }

    @Test
    fun `check correctness of answer 9`() {
        var mQuestionsList: ArrayList<Question>? = null
        mQuestionsList = Constants.getQuestions()
        val question = mQuestionsList?.get(8)
        if (question != null) {
            assertEquals(question.correctAnswer, 2)
        }
    }

    @Test
    fun `check correctness of answer 10`() {
        var mQuestionsList: ArrayList<Question>? = null
        mQuestionsList = Constants.getQuestions()
        val question = mQuestionsList?.get(9)
        if (question != null) {
            assertEquals(question.correctAnswer, 4)
        }
    }

}
