package processes

import traits.Process
import scala.io.StdIn._
/*
* Encapsulates a single question and answer process.
*/
class QuestionAndAnswer(val question: String) extends Process {

  def execute(): Unit = {
    var inputValid = false

    while (inputValid == false) {
      println(s"$question")
      val userInput = readLine()
      inputValid = validateInput(userInput)
    }
  }

  private def validateInput(input: String): Boolean = {
    val validator = new InputValidator(question, input)
    validator.execute()
  }
}