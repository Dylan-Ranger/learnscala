package models

import scala.collection.mutable.ArrayBuffer

object GlobalStorage {
  val questions = ArrayBuffer(
    "What is your first name?",
    "What is your last name?",
    "Please enter your date of birth (Format: YYYY-MM-DD)",
    "How much do you weigh?",
    "How tall are you in meters?",
    "What is your nationality?",
    "What is your gender?"
  )
}
