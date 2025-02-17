package models

sealed trait Gender
case object Male extends Gender
case object Female extends Gender

class User(
  val firstName: String,
  val lastName: String,
  val nationality: String,
  val placeofbirth: String,
  val dateOfBirth: String,
  val height: Double,
  val weight: Double,
  val sex: Gender) {

}