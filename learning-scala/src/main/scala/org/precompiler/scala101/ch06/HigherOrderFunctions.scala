package org.precompiler.scala101.ch06

/**
  * Created by RL on 8/27/17.
  */
object HigherOrderFunctions {
  def calc(n: Int, fn: Int => Int): Int = {
    var result = 0
    for (i <- 1 to n) {
      result += fn(i)
    }
    result
  }
  def main(args: Array[String]): Unit = {
    println(calc(10, i => i))
    println(calc(10, i => i * 10))
    println(calc(10, i => if (i % 2 == 0) i else 0))
  }
}
