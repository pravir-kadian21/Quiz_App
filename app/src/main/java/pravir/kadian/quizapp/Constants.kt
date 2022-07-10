package pravir.kadian.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Australia",
            "Belgium",
            "Germany",
            1
        )
        val que2 = Question(
            2,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Australia",
            "Belgium",
            "Germany",
            2
        )
        val que3 = Question(
            3,"What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Argentina",
            "Australia",
            "Belgium",
            "Germany",
            3
        )
        val que4 = Question(
            4,"What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil",
            "Australia",
            "Belgium",
            "Germany",
            1
        )
        val que5 = Question(
            5,"What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Argentina",
            "Denmark",
            "Belgium",
            "Germany",
            2
        )
        val que6 = Question(
            6,"What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Argentina",
            "Australia",
            "Fiji",
            "Germany",
            3
        )
        val que7 = Question(
            7,"What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Argentina",
            "Australia",
            "Belgium",
            "Germany",
            4
        )
        val que8 = Question(
            8,"What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Argentina",
            "India",
            "Belgium",
            "Germany",
            2
        )
        val que9= Question(
            9,"What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait",
            "Australia",
            "Belgium",
            "Germany",
            1
        )
        val que10 = Question(
            10,"What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Argentina",
            "New Zealand",
            "Belgium",
            "Germany",
            2
        )
        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)

        return questionsList
    }
}