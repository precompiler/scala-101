package org.precompiler.scala101.ch09

/**
  *
  * @author Richard Li
  */
object PatternVariablesAndConstants extends App {
  val max = 100
  val Max = 200
  var Max2 = 300
  val max3 = 400
  def process_wrong(input: Int): Unit = {
    input match {
      case max => println(s"input ${input} match max") // pattern variable is shadowing the variable max
    }
  }
  process_wrong(10)

  def process(input: Int): Unit = {
    input match {
      case Max => println(s"input match ${Max}") // use capitalized name to ask scala to search the constant in the scope
      case `max` => println(s"input match ${max}")
      // case Max2 => println("Invalid") must be a constant variable
      case this.max3 => println(s"input match ${max3}")
      case _ => println("No match")
    }
  }

  process(10)
  process(100)
  process(200)
  process(500)
  process(400)
}
