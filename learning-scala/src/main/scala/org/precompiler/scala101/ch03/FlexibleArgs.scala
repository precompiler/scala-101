package org.precompiler.scala101.ch03

/**
  *
  * @author Richard Li
  */
object FlexibleArgs extends App {
  def sum(i: Int*): Int = {
    i.sum
  }

  def max(i: Int*): Int = {
    (0 /: i) {
      Math.max
    }
  }

  def checkType(i: Int*): Unit = {
    println(i.getClass)
  }

  println(sum(1, 2, 3, 4))
  println(max(1, 2, 3, 4))

  val numbers = Array(1, 2, 3, 4)
  //Error
  //val s = sum(numbers)
  val s = sum(numbers: _*) // array explode notation
  println(s)

  checkType(numbers: _*)
}
