package processes

import traits.Process
/*
* Encapsultes a single question and answer process.
*/
class QuestionAndAnswer[T](val question: String, val inputType: T) extends Process {

  def execute(): Unit = {
    var inputValid = false
    var counter = 1
    println(s"Count to ${inputType} with me. I'll start with 1")

    while (inputValid == false) {
      println("Enter the next number")
      var userInput = readLine()

      // Basic input validation structure
      var moveToNext = false
      while (moveToNext == false) {
        val isValidInput = validateInput(userInput, counter + 1)

        if (isValidInput == true) {
          moveToNext = true
        } else {
          println("That is not the correct input. Try again")
          userInput = readLine()
        }
      }

      println("Well Done!")
      counter += 1

      if (counter == inputType) {
        inputValid = true
      }
    }
  }

  private def validateInput(input: String, counter: Int): Boolean = {
    try {
      if (Integer.parseInt(input) == counter) {
        true
      } else {
        false
      }
    } catch {
      case error: Error => false
    }
  }
}