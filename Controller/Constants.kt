package com.quizapp

import com.quizapp.R
import com.quizapp.Question
import java.util.*
import kotlin.collections.ArrayList

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()


        // 1
        val que1 = Question(
            1, "For how much money would you burn the following place?",
            R.drawable.one,
            "1 Million", "5 Million",
            "10 Million", "If I do, I won't be able to graduate!", 4
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Which is the worst department of BRACU?",
            R.drawable.two,
            "MNS!", "Choose Option 1!",
            "Choose Option 1!", "Choose Option 1!", 1
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Identify the following word!",
            R.drawable.three,
            "Fruit", "Color",
            "Brand", "All of the above", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Answer the following?",
            R.drawable.four,
            "4", "6",
            "9", "Let, the number be X", 4
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Answer the following...?",
            R.drawable.five,
            "Park", "BRAC University",
            "Restaurant", "Movie Theater", 2
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Answer the following...",
            R.drawable.six,
            "US", "UK",
            "Canada", "TARC", 4
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Identify the following tense...?",
            R.drawable.seven,
            "Future Tense", "Present Tense",
            "Future Impossible Tense", "Past Tense", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Are you satisfied with the following term?",
            R.drawable.eight,
            "Yes", "No!",
            "Option 1", "Option 3", 2
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Answer the following...?",
            R.drawable.nine,
            "Turtle", "Snail",
            "Internet Explorer", "Ubuntu Lab PC", 4
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "If you could go back to the start of the semester what would you do?",
            R.drawable.ten,
            "Drop the semester", "Study seriously from the start",
            "Take less number of course", "Take an extra course", 1
        )

        questionsList.add(que10)
        questionsList.shuffle()
        return questionsList
    }
}