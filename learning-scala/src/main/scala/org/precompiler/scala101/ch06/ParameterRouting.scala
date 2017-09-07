package org.precompiler.scala101.ch06

/**
  * Created by RL on 9/7/17.
  */
object ParameterRouting {
  def main(args: Array[String]): Unit = {
    val array = Array(1, 9, 4, 8, 3)
    var largest = (Integer.MIN_VALUE /: array) {(carry, elem) => Math.max(carry, elem)}
    println(largest)
    largest = (Integer.MIN_VALUE /: array) {Math.max(_, _)}
    println(largest)
    largest = (Integer.MIN_VALUE /: array) {Math.max _}
    println(largest)
    largest = (Integer.MIN_VALUE /: array) {Math.max}
    println(largest)
  }
}
