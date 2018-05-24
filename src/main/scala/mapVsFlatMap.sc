object mapVsFlatMap {
  val numList = List(List(1,2,3), List(4,5),List(6))
  numList.map{x=> x}
  numList.flatMap{x=> x}
}