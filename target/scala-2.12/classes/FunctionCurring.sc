object FunctionCurring {
  def add(a:Int,b:Int,c:Int) = a + b + c
  add(1,2,3)

  def add2(a:Int)(b:Int)(c:Int)= a + b + c
  add2(1)(2)(3)

  //implicit parameters
  implicit val a:Int = 12
  def add3(x: Int)( implicit y : Int) = x + y

  add3(11)
  
}