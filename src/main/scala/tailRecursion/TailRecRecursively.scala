package tailRecursion

  import scala.annotation.tailrec

  object TailRecRecursively extends App {
    val list = List.range(1, 100000)
    println(max(list))
    println(max2(list))
    println(max3(list))

    //usando match
    def max(ints: List[Int]): Int = {
      @tailrec
      def maxAccum(ints: List[Int], theMax: Int): Int = {
          ints match {
          case Nil => theMax
          case x :: tail =>
            val newMax = if(x > theMax) x else theMax
            maxAccum(tail,newMax)
        }

    }
      maxAccum(ints,0)
    }

    //usando if/else
    def max2(ints: List[Int]): Int = {
      @tailrec
      def maxAccum2(ints: List[Int], theMax: Int): Int = {
        if(ints.isEmpty){
          return theMax
        } else {
          val newMax=  if(ints.head>theMax) ints.head else theMax
          maxAccum2(ints.tail,newMax)
        }

      }
      maxAccum2(ints,0)
    }

    //usando if/else sin {} en el if
    def max3(ints: List[Int]): Int = {
      @tailrec
      def maxAccum3(ints: List[Int], theMax: Int): Int = {
        if(ints.isEmpty) theMax
        else {

          val newMax=  if(ints.head>theMax) ints.head else theMax
          maxAccum3(ints.tail,newMax)
        }

      }
      maxAccum3(ints,0)
    }

  }
