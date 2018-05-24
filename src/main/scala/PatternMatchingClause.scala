object PatternMatchingClause  extends App {
  val num:Int = 10
  num match {
    case x if x % 2 == 0 => println("Even numer")
    case  _ => println("Odd number.")

  }

}
