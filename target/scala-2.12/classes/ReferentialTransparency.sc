object ReferentialTransparency {
  val x = 10
  //val y = x + 1

  def addOne(a: Int) = a + 1

  val y =addOne(x)

}