package ch03

/**
  *
  * @author Richard Li
  */
object ModulesAndObjects extends App with Calc {
  println(calculator.add(1, 2))

}



trait Calculate {
  trait Calculator {
    def add(a: Int, b: Int): Int
    def mul(a: Int, b: Int): Int
  }
  def calculator: Calculator
}

trait Calc extends Calculate {
  class CalculatorImpl extends Calculator {
    override def add(a: Int, b: Int): Int = a + b
    override def mul(a: Int, b: Int): Int = a * b
  }
  object calculator extends CalculatorImpl
}
