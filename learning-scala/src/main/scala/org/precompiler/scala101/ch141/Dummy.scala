package org.precompiler.scala101.ch141

/**
  *
  * @author Richard Li
  */
class Dummy(val str: String) {
  def foo(): Unit = println(str)
}

object Dummy {
  def apply(str: String): Dummy = new Dummy(str)
  def print(): Unit = {
    println("a dummy")
  }
}
