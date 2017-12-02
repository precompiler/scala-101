package org.precompiler.scala101.ch14

/**
  *
  * @author Richard Li
  */
object UseJavaClassInScala extends App {
  val j = new JavaClass
  // j.yield() yield is a scala keyword
  j.`yield`()
}
