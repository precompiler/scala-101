package org.precompiler.scala101.ch08

/**
  *
  * @author Richard Li
  */
object ListDemo extends App{
  val numbers = List(1, 2, 3, 4, 5)

  println(numbers(1))
  println(numbers.head)
  println(numbers.tail)

  val number1 = 0 :: numbers

  println(number1 ::: List(6))


}
