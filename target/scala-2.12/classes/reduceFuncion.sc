object reduceFuncion {
  val numList = List(1,2,3,4,5,6)
  numList.reduce((x,y) => x + y)
  numList.reduce(_ + _)
  numList.reduce(_-_)
  numList.reduce(_*_)
}