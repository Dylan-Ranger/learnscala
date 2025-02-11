import scala.io.StdIn.{readLine, readInt, readDouble}


object UserInformationFormatter {
  def executeUserInterAction(): Unit = {
      // Println does not require an import
      println("Welcome to the personal information formatter!")
      println("What is your first name?")
      val userFirstName = readLine() // Readline is imported from the io.StdIn Lib

      println("What is your last name?")
      val userLastName = readLine()

      println("How old are you?")
      val userAge = readInt()

      println("How much do you weigh?")
      val userWeight = readInt() // Values can be parsed at a command-line level (See Double below)

      println("How tall are you in meters?")
      val userHeight = readDouble()

      println("What is your nationality?")
      val userNationality = readLine()

      println("What is your gender?")
      val userGender = readLine()

      // Multi-line string are created by using three quotation symbols
      val userIdCard =  s""" USER IDENTIFICATION CARD:
          | =====================================
          | Name:        ${userFirstName}
          | Surname:     ${userLastName}
          | Gender:      ${userGender}
          | Age:         ${userAge}
          | Nationality: ${userNationality}
          | =====================================
          |""".stripMargin

      val userFacts =
          s""" Here are some interesting facts about you:
            | You have lived ${userAge * 365} days
            | You are ${userHeight * 3.28084} feet tall
            |""".stripMargin

      println(userIdCard)
      println("\n"+userFacts)
  }
}