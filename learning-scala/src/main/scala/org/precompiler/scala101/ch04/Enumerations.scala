package org.precompiler.scala101.ch04

import org.precompiler.scala101.ch04.Currency.Currency

/**
  *
  * @author Richard Li
  */
object Enumerations {
  def main(args: Array[String]): Unit = {
    Currency.values.foreach(println(_))
    val euro = new Money(100, Currency.EURO)
    println(euro)
  }
}

object Currency extends Enumeration {
  //this tells the compiler to treat the word Currency as a type instead of an instance
  type Currency = Value
  val CNY, GBP, EURO, USD = Value
}

class Money(val amount: Double, val currency: Currency) {
  override def toString: String = s"${amount} ${currency} "
}