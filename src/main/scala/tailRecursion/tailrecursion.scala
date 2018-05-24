package tailRecursion

import scala.annotation.tailrec

object tailrecursion extends App {


  //cuando la litlista es muy grande  las llamas recursivas normales generan Un StackOverFlowException
    val list = List.range(1, 1000000)
    println(sum2(list))
    //println(sum(list))
    //println(sum1(list))

    //llamada recursiva normal cuando la lista es demasiado grande
    /*def sum(ints: List[Int]): Int = ints match{
      case Nil =>0
      case x :: tail => x+ sum(tail)

    }*/

    //llamada recursiva normal
    /*def sum1(xs: List[Int]): Int = {
      val num = List(xs.head)
      if(!xs.isEmpty){
        sum1(xs.tail)
      }
      0
    }*/

    //tail-recursion:el compilador lo convierte en un ciclo while  que no requiere forzar un nuevo marco en la pila para cada llamada recursiva
    //llamada recursiva con tail.
    def sum2(ints: List[Int]): Int = {
      @tailrec
      def sumAccumulator(ints: List[Int], accum: Int): Int = {
        ints match {
          case Nil => accum
          case x :: tail =>sumAccumulator(tail,accum + x)
        }
      }
      sumAccumulator(ints,0)

    }







}
