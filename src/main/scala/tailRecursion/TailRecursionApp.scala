package tailRecursion

import scala.annotation.tailrec

object TailRecursionApp extends App {

  val list = List(1,2,3,4,5,6,7,8,9)
  val list2 = tailRecursion(list)

  println("Original List =" + list)
  println("After Tail Recursion of List =" + list2)


  def tailRecursion[A](listOfElements: List[A]): List[A]= {
    @tailrec
    def reverse(updateList: List[A],originalList: List[A]):  List[A] =
      originalList match  {
      case Nil => updateList
      case head :: tail => reverse(head:: updateList,tail)

    }
    reverse(Nil,listOfElements)
  }


}
