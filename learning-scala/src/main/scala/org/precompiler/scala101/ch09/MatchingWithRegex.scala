package org.precompiler.scala101.ch09

/**
  *
  * @author Richard Li
  */
object MatchingWithRegex extends App {
  val pattern = "(S|s)cala".r
  val str = "Scala rocks, go scala"
  println(pattern.findFirstIn(str))
  println(pattern.findAllIn(str).mkString(","))

  val numbers = "\\d{1,}".r

  val tokenAndValue = "(.+):(\\d*)".r

  def check(input: String): Unit = {
    input match {
      case numbers() => println("found numbers")
      case tokenAndValue(token, value) => println(s"token = ${token}, value = ${value}")
      case _ => println("Unknown")
    }
  }

  check("213")
  check("TEC:100")
  check("dummy")

}
