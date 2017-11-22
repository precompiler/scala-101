package org.precompiler.scala101.ch12

import scala.io._

/**
  *
  * @author Richard Li
  */
object LazyEvaluation extends App {
  def downloadMovie(): Boolean = {
    println("Start downloading movie...")
    Thread.sleep(10000)
    println("Movie downloaded")
    true
  }
  lazy val downloadCompeleted = downloadMovie()

  val hasWifi = true
  if (hasWifi && downloadCompeleted) {
    println("Starting watching it")
  }

  def read: Int = {
    println("Input a number:")
    StdIn.readInt()
  }

  lazy val num1 = read
  lazy val num2 = read
  println("=================")
  println(s"result = ${num1 - num2}")
}

