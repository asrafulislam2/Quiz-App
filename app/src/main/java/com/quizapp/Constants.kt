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
            1, "How the internal components of a software work with each other can be tested by",
            R.drawable.tst,
            "Unit Testing", "Integration Testing",
            "System Testing", "Acceptance Testing", 2
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, " In your software company, every detail of client meetings are documented and analysed by the development team to keep consistency between client requirement and system implementaion. Such an activity refers to?",
            R.drawable.tst,
            "Verification", "Validation",
            "Integration", "None of the above", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Acceptance Testing is generally done by:",
            R.drawable.tst,
            "Customer", "Developers",
            "Management Team", "Testers", 1
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Continuous change of software features can be supported by?",
            R.drawable.tst,
            " Linear Process Model", "Evolutionary Process Model",
            "Sequential Process Model", "None of the above", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "In incremental process model, increment refers to?",
            R.drawable.tst,
            "Incremental growth of the software requirements by customers", "Incrmental growth of resource and tools",
            "Incremental delivery of the software", "None of the above", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "In which case of the following, you would use spiral model?",
            R.drawable.tst,
            "Book Management Website", "Language Translator",
            "Ludo Game", "Cooking Robot", 4
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "In which ceremony the team can discuss the difficulties that they faced during the software development?",
            R.drawable.tst,
            "Daily Scrum Meeting", "Burndown chart",
            " Sprint Retrospective", " Sprint Review", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "A software organization follows similar and characterized software process for all of its development projects, then the organization is at which CMMI level?",
            R.drawable.tst,
            "Defined", "Initial",
            "Managed", "Optimized", 1
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Agile emphasizes more on:",
            R.drawable.tst,
            "Contract", "Individual",
            "Documentation", "Planning", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Which of the following is not discipline of XP?",
            R.drawable.tst,
            " Pair programming", "Test driven development",
            " Continuous Integration", " Detailed documentation", 4
        )

        questionsList.add(que10)
        //questionsList.shuffle()
        return questionsList
    }
}