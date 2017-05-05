package org.precompiler.scala101.ch01

/**
  *
  * @author Richard Li
  */
object HelloWorld extends App {
  println("Hello World")
  sayHello("World")
  def sayHello(name: String): Unit = {
    println(s"Hello, ${name}")
  }
}
