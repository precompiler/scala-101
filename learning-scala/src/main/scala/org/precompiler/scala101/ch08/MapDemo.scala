package org.precompiler.scala101.ch08

/**
  *
  * @author Richard Li
  */
object MapDemo extends App{
  val cache = Map(
    1 -> ("One", "i qi", "一", "1"),
    2 -> ("Two", "ni", "二", "2")
                  )
  val two = 2
  println(s"How to write ${two} in Chinese: ${cache(two)._3}")

  cache.get(1).map(t => println(t))
  cache.get(9).map(e => println(e))
}
