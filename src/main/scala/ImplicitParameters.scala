object ImplicitParameters extends App {

 implicit val a:Int = 12
def add(x: Int)(implicit y: Int) = x + y

  add(11)
  println(add(11))
}

