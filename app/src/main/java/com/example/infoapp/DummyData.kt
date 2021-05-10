package com.example.infoapp

object DummyData {
    val facts = listOf<InfoModel>(
        InfoModel(
            "Kotlin",
            R.drawable.kotlin_logo,
            "The name comes from Kotlin Island, near St. Petersburg." +
                    " Andrey Breslav mentioned that the team decide to name it after an island"
        ),
        InfoModel(
            "Java",
            R.drawable.ic_java_logo,
            "The language was initially called Oak after an oak tree that stood outside Gosling's office. " +
                    "Later the project went by the name Green and was finally renamed Java," +
                    " from Java coffee, a type of coffee from Indonesia"
        ),
        InfoModel(
            "Javascript",
            R.drawable.javascript_logo,
            "It was initially called Livescript until December 1995 wwhen it was changed to Javascript" +
                    "The choice of the JavaScript name has caused confusion, " +
                    "sometimes giving the impression that it is a spin-off of Java. " +
                    "Since Java was the hot new programming language at the time, " +
                    "this has been characterized as a marketing ploy by Netscape to give its own new language cachet"
        ),
        InfoModel(
            "Python",
            R.drawable.python_logo,
            "Why is it called Python? ... When he began implementing Python, " +
                    "Guido van Rossum was also reading the published scripts from “Monty Python's Flying Circus”," +
                    " a BBC comedy series from the 1970s. Van Rossum thought he needed a name that was short, " +
                    "unique, and slightly mysterious, so he decided to call the language Python."
        ),
        InfoModel(
            "PHP",
            R.drawable.php_logo,
            "PHP development began in 1994 when Rasmus Lerdorf wrote several Common Gateway Interface (CGI) programs in C, " +
                    "which he used to maintain his personal homepage. " +
                    "He extended them to work with web forms and to communicate with databases, " +
                    "and called this implementation \"Personal Home Page/Forms Interpreter\" or PHP/FI."
        )
    )
}