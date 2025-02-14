package processes

import traits.Process
/*
* Encapsultes a single question and answer process.
*/
class QuestionAndAnswer[T](val question: String, inputType: T) extends Process {

  def execute(): Unit = {
    println("Question class instantiated.")
  }
}