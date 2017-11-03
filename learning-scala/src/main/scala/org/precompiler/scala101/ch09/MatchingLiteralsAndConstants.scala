package org.precompiler.scala101.ch09

/**
  *
  * @author Richard Li
  */
object MatchingLiteralsAndConstants extends App {
  def translate(weekday: String) = {

    weekday match {
      case "Sunday" => println("周日")
      case "Saturday" => println("周六")
      case "Monday" => println("周一")
      case unknown => println(s"unknown: ${unknown}")
    }
  }

  List("Sunday", "Saturday", "Monday", "Wednesday").foreach(translate)

  def translate(weekday: DayofWeek.Value) = {
    weekday match {
      case DayofWeek.MONDAY => println("周一")
      case DayofWeek.TUESDAY => println("周二")
      case DayofWeek.WEDNESDAY => println("周三")
      case _ => println("Unknown")
    }
  }

  translate(DayofWeek.MONDAY)
  translate(DayofWeek.FRIDAY)

}

object DayofWeek extends Enumeration {
  val MONDAY = Value("Monday")
  val TUESDAY = Value("Tuesday")
  val WEDNESDAY = Value("Wednesday")
  val FRIDAY = Value("Friday")
}
