package util

class IdNumberGenerator(private val birthDate: String, private val gender: String, private val isCitizen: Boolean) {
  def apply(): Unit = {
    calculateDateOfBirthDigits()
  }

  private def calculateDateOfBirthDigits(): Unit = {
    val modifiedString = birthDate.replace("-", "").drop(2)
    println(modifiedString)
  }
}