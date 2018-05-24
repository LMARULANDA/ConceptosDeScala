object FirstClassCitizens {
  //usar una funcion como un valor normal o variable
  def doubleIt(x: Int) = x * x
  def addOne(x: Int) = x + 1
  val result = 10 + doubleIt(20) + addOne(49)

  //asignar una funcion anonima a una variable
  val addFunction = (a: Int , b: Int) => a + b
 //scala REPL
  val addFunction1 = (a: Int, b: Int) => a + b
  addFunction1(10,20)

  def display(x: Int) = println("x value = " + x)
  display(addFunction1(10,20))

}