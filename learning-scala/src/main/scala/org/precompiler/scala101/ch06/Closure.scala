package org.precompiler.scala101.ch06

/**
  * Created by RL on 9/14/17.
  */
object Closure extends App{
  def visit(list: List[Int], closure: Int => Unit): Unit = {
    for (i <- list) {
      closure(i)
    }
  }
  var sumTotal = 0
  def doSum(i: Int): Unit = {
    sumTotal += i
  }

  val list = List(1, 2, 3, 4, 5, 6)
  visit(list, doSum)

  println(s"sum is ${sumTotal}")
}
