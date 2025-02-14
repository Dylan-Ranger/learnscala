package models

/*
* Encapsultes a single question and answer process.
*/
class QuestionAndAnswer(val question: String, ) {



  def apply(): Unit = {
    println("Question class instantiated.")
  }
}