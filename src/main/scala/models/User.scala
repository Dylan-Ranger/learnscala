package models

class User(
  val firstName: String,
  val lastName: String,
  val nationality: String,
  val placeofbirth: String,
  val dateOfBirth: String,
  val height: Double,
  val weight: Double,
  val sex: Enum) {

  def apply(): Unit = {
    println("User class instantiated.")
  }

}