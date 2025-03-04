package processes

import traits.Process

class InputValidator(question: String, input: String) extends Process {
  var response: String = ""

  def execute(): Boolean = {
    val isValid = matchQuestionToValidator(question)
    println(response)
    isValid
  }

  private def matchQuestionToValidator(question: String): Boolean = question match {
    case "What is your first name?" => validateName()
    case "What is your last name?" => validateLastName()
    case "Please enter your date of birth (Format: YYYY-MM-DD)" => validateDateOfBirth()
    case "How much do you weigh?" => validateWeight()
    case "How tall are you in meters?" => validateHeight()
    case "What is your nationality?" => validateNationality()
    case "What is your gender?" => validateGender()
    case _ => false
  }

  private def validateName(): Boolean = {
    // TODO: implement validation
    response = "That was a valid input"
    true
  }

  private def validateLastName(): Boolean = {
    // TODO: implement validation
    response = "That was a valid input"
    true
  }

  private def validateDateOfBirth(): Boolean = {
    // TODO: implement validation
    response = "That was a valid input"
    true
  }

  private def validateWeight(): Boolean = {
    // TODO: implement validation
    response = "That was a valid input"
    true
  }

  private def validateHeight(): Boolean = {
    // TODO: implement validation
    response = "That was a valid input"
    true
  }

  private def validateNationality(): Boolean = {
    // TODO: implement validation
    response = "That was a valid input"
    true
  }

  private def validateGender(): Boolean = {
    // TODO: implement validation
    response = "That was a valid input"
    true
  }
}