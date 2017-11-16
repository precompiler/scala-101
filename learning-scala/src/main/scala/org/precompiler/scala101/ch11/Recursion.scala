package org.precompiler.scala101.ch11

import scala.annotation.tailrec

/**
  *
  * @author Richard Li
  */
object Recursion extends App {
  def factorial(num: Int): BigInt = {
    if (num == 0) 1 else num * factorial(num - 1)
  }

  println(factorial(3))
  // println(factorial(10000)) stack over flow

  def m1(num: Int): Int = {
    if (num == 0) throw new RuntimeException("Stop!") else 1 * m1(num - 1) // final call is multiplication, scala won't optimize this recursion
  }

  def m2(num: Int): Int = {
    if (num == 0) throw new RuntimeException("Stop!") else m2(num - 1) // tail recursion, final call is the function itself, scala will optimize this recursion
  }
  //stack trace will be different
  try {
    m1(15)
  } catch {
    case ex: RuntimeException => ex.printStackTrace()
  }
  println("------------------------------------------")
  try {
    m2(15)
  } catch {
    case ex: RuntimeException => ex.printStackTrace()
  }

  //use this annotation to ask compiler to check if this is a tail recursion which can be optimized, following code will have compile error
//  @tailrec
//  def factorial2(num: Int): BigInt = {
//    if (num == 0) 1 else num * factorial(num - 1)
//  }
  @tailrec
  def factorialOptimized(fact: BigInt, num: Int): BigInt = {
    if (num == 0) {
      fact
    } else {
      factorialOptimized(fact * num, num - 1)
    }
  }

  println(factorialOptimized(1, 10000))
}
