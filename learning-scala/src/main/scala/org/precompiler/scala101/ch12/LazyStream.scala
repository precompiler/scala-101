package org.precompiler.scala101.ch12

/**
  *
  * @author Richard Li
  */
object LazyStream extends App {
  def memSeq(start: Int): Stream[Int] = {
    start #:: memSeq(start + 1)
  }
  println(memSeq(1))

  println(memSeq(1).take(10).force)
  println(memSeq(20).take(10).toList)
  println(memSeq(40).takeWhile(n => n < 80).force)

  def fib(num1: Int, num2: Int): Stream[Int] = {
    val num3 = num1 + num2
    num3 #:: fib(num2, num3)
  }

  println( (1 +: (1 +: fib(1, 1)).take(20)).force)
}
