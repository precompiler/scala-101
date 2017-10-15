package org.precompiler.scala101.ch08

/**
  *
  * @author Richard Li
  */
object SetDemo extends App{
  val colors = Set("Red", "Green", "Blue")
  println(s"Colors: ${colors}")

  val colors2 = colors + "Yellow"
  val intersectColor = colors & colors2

  println(s"Colors: ${colors}")
  println(s"Colors2: ${colors2}")
  println(s"Colors + Colors2: ${colors ++ colors2}")
  println(s"Union colors: ${intersectColor}")

  val numbers = Set(1, 2, 3, 4, 5, 6)
  val sum = (0 /: numbers) {_ + _}
  val sum2 = (numbers :\ 0) {_ + _}
  println(sum)
  println(sum2)


}
