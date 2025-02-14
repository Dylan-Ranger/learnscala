class IdNumberGenerator(private val birthDate: String, private val gender: String, private val isCitizen: Boolean) {
  def apply() = {
    calculateDateOfBirthDigits()
  }

  private def calculateDateOfBirthDigits(): String = {
    val modifiedString = birthDate.replace("-", "").drop(2)
    println(modifiedString)
    modifiedString
  }
}