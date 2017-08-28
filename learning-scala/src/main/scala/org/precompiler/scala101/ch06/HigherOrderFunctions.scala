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

  def calcArea(r: Double, pi: () => Double): Double = {
    pi() * r * r
  }
  def main(args: Array[String]): Unit = {
    println(calc(10, i => i))
    println(calc(10, i => i * 10))
    println(calc(10, i => if (i % 2 == 0) i else 0))
    println(calcArea(1.5, () => 3.14d))
    println(calcArea(1.5, () => 3.14159265358979d))

    val array = Array(3, 7, 2, 20, 1, 10, 12)
    val sum = array.foldLeft[Int](0) {(sum, elem) => {sum + elem}}
    println(sum)

    val max = array.foldLeft(Int.MinValue){(i, elem) => {if (i > elem) i else elem}}
    println(max)

    println((0 /: array) {(i, elem) => {if (i > elem) i else elem}})
    println((array :\ 0) {(i, elem) => {if (i > elem) i else elem}})
  }
}
