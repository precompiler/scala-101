package org.precompiler.scala101.ch041
import org.precompiler.scala101.ch04._
/**
  *
  * @author Richard Li
  */
object PackageObject {
  def main(args: Array[String]): Unit = {
    val money = new Money(100, Currency.CNY)
    convert(money, Currency.EURO)
  }
}
