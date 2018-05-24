object forComprehennsion {
  val numList = List(1,2,3,4,5)
  for(num <- numList) yield num + 1

  //for-comprehensions=filter + map
  numList.filter(a => a%2 ==0).map(b => b*b)

  //for-comprehension
  for(num <- numList if num % 2 == 0) yield num*num
}