package org.precompiler.scala101.ch06

/**
  *
  * @author Richard Li
  */
object FunctionValue extends App{
  def operation(a: Int, b: Int, fn: (Int, Int) => Int): Int = {
    fn(a, b)
  }

  val add = (a: Int, b: Int) => a + b

  def mul(a: Int, b: Int): Int = {
    a * b
  }

  println(operation(1, 2, add))
  println(operation(1, 2, mul))
}
