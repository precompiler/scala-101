package org.precompiler.scala101.ch09

import org.precompiler.scala101.ch09.MatchingTypesAndGuards.process

/**
  *
  * @author Richard Li
  */
object MatchingTypesAndGuards extends App{
  def process(input: Any): Unit = {
    input match {
      case cnt: Int if (cnt < 0) => println(s"Invalid ${cnt}")
      case  a:Int => println("process Int")
      case (a:Int, b:Int) => println("process tuple of Int, Int")
      case (a:Double, b:Double) => println("process tuple of Double, Double")
      case (a: Any, b: Any) => println(s"process tuple of ${a.getClass} ${b.getClass}")
      case cnt: Int if (cnt < 0) => println(s"Invalid ${cnt}")
      case _ => println("Invalid input")
    }
  }
  process(1)
  process((1, 1))
  process((1.1, 2.2))
  process(-1)
  process(("a", "b"))
}
