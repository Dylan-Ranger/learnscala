object Main {
  def main(args: Array[String]): Unit = {
    if (args.isEmpty) {
      println("You can specify a program to run by passing the ClassName as an argument to the sbt run command.")
    } else {
      println(s"Arg passed ${args(0)}")
    }
    UserInformationFormatter.executeUserInterAction()
  }
}