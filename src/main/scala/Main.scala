import processes._
import models._

object Main {
  def main(args: Array[String]): Unit = {
    print("Your program compiles. Congrats!")
     val qAndA = new QuestionAndAnswer[Int]("Who dis", 5)
     qAndA.execute()
    // TODO: Questions datastructure using implicits to make input type dynamic in QuestionAndAnswer.
    // TODO:

//    def executeUserInterAction(): Unit = {
//      // Println does not require an import
//      println("Welcome to the personal information formatter!")
//      println("What is your first name?")
//      val userFirstName = readLine() // Readline is imported from the io.StdIn Lib
//
//      println("What is your last name?")
//      val userLastName = readLine()
//
//      println("Please enter your date of birth (Format: YYYY-MM-DD")
//      var dateOfBirth = readLine()
//      val userAge = 2025 - Integer.parseInt(dateOfBirth.split("-")(0)) // Types can be converted in much the same way as Java.
//
//      println("How much do you weigh?")
//      val userWeight = readInt() // Values can be parsed at a command-line level (See Double below)
//
//      println("How tall are you in meters?")
//      val userHeight = readDouble()
//
//      println("What is your nationality?")
//      val userNationality = readLine()
//
//      println("What is your gender?")
//      val userGender = readLine()
//
//      /*
//       Multi-line string are created by using three quotation symbols.
//       String interpolation is achieved by prefixing strings with s and then interpolation with ${<value>}
//       */
//      val userIdCard =  s""" USER IDENTIFICATION CARD:
//                           | =====================================
//                           | Name:        ${userFirstName}
//                           | Surname:     ${userLastName}
//                           | Gender:      ${userGender}
//                           | Age:         ${userAge}
//                           | Height:      ${userHeight}
//                           | Weight:      ${userWeight}
//                           | Nationality: ${userNationality}
//                           | =====================================
//                           |""".stripMargin
//
//      // Operations can be carried out inside the interpolation.
//      val userFacts =
//        s""" Here are some interesting facts about you:
//           | You have lived ${userAge * 365} days
//           | You are ${userHeight * 3.28084} feet tall
//           |""".stripMargin
//
//      println(userIdCard)
//      println("\n"+userFacts) // Variables don't have to be interpolated addition works too.
  }
}