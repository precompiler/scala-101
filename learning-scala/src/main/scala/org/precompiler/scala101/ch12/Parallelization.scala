package org.precompiler.scala101.ch12



import scala.io.{BufferedSource, Source}


/**
  *
  * @author Richard Li
  */
object Parallelization extends App {
  def askBaidu(keyword: String): BufferedSource = {
    val url = s"http://www.baidu.com/s?word=${keyword}"
    val res = Source.fromURL(url)
    res
  }
  val keywords = List("Dublin", "Guinness", "Cliffs%20of%20Moher", "Citywest%20Campus")

  var start = System.currentTimeMillis()
  keywords.foreach(askBaidu)
  var end = System.currentTimeMillis()
  println(s"Time cost in sequential mode ${end - start} ms")

  start = System.currentTimeMillis()
  keywords.par.foreach(askBaidu)
  end = System.currentTimeMillis()
  println(s"Time cost in parallel mode ${end - start} ms")

  def printThreadInfo(dummy: String): Unit = {
    println(s"${dummy} -- ${Thread.currentThread().getName}")
  }

  val dummies = List("foo", "bar", "baz")
  dummies.foreach(printThreadInfo)
  println("==============================")
  dummies.par.foreach(printThreadInfo)

}
