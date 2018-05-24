object ImplicitConversions {
  implicit def str2Int(str:String) = str.toInt
  val num = 10
  val numInString = "20"
  val result = num * numInString
  println(result)
}