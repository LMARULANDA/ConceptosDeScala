object PartialFunctions {
  val numRange = 1 to 5
  val isEven: PartialFunction[Int, String] = {
    case num if num % 2 == 0 =>num + "is even"
      val evenNumbers = numRange collect isEven
      
  }
}