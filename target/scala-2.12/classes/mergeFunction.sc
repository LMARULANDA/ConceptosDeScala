object merge {

  val list1 = List(1,2,4)
  val list2 = List(3,5)
  list1 ++ list2
  def merge [A](list1: List[A],list2:List[A]): List[A] = list1 ++ list2
  merge(list1,list2)
}