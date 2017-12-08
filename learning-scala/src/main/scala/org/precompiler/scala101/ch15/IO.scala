package org.precompiler.scala101.ch15

/**
  *
  * @author Richard Li
  */
import scala.io._
object IO extends App {
//  println("What is your name? ")
//  val name = StdIn.readLine()
//  println(s"Hello ${name}")

  Source.fromFile("src/main/scala/org/precompiler/scala101/ch15/IO.scala").foreach(print)

  println(Source.fromURL("http://baidu.com").mkString(""))
}
