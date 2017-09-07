package org.precompiler.scala101.ch06

/**
  * Created by RL on 9/7/17.
  */
object Currying {
  def main(args: Array[String]): Unit = {
    def foo(a: Int)(b: Int)(c: Int): Unit = {
      println("FOO")
    }
    val func = foo _
    println(func)
    println(func(1))
    println(func(1)(2))
    println(func(1)(2)(3))
  }
}
