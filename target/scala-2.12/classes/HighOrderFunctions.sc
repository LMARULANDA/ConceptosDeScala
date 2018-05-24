object HighOrderFunctions {

  val addOne = (x: Int) => x + 1

  def hof(f: Int => Int) = f

  //pasamos addOne a la funcion hof como parametro
  val result = hof(addOne)
  result(10)
}

