package org.precompiler.scala101.ch05

import scala.language.implicitConversions
import java.time.LocalDate

class DateHelper(offset: Int) {
  def days(when: String): LocalDate = {
    val today = LocalDate.now()
    when match {
      case "ago" => today.minusDays(offset)
      case "from_now" => today.plusDays(offset)
      case _ => today
    }
  }
}


object ImplicitTypeConversions {
  implicit def int2DateHelper(offset: Int): DateHelper =  new DateHelper(offset)
  def main(args: Array[String]): Unit = {
    val twoDaysAgo = 2 days "ago"
    val fiveDaysL8er = 5 days "from_now"

    println(twoDaysAgo)
    println(fiveDaysL8er)
  }
}


