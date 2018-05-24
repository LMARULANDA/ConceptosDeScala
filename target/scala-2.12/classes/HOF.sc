object HOF {
  def fun(a:Int, b:Int):Int => Int = a => b
  fun(10,20)
  
}