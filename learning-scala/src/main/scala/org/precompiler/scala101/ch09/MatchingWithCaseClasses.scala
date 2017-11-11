package org.precompiler.scala101.ch09

/**
  *
  * @author Richard Li
  */

trait Operator
case class Add(operand1: Double, operand2: Double) extends Operator
case class Sub(operand1: Double, operand2: Double) extends Operator
case class Mul(operand1: Double, operand2: Double) extends Operator
case class Div(operand1: Double, operand2: Double) extends Operator


object MatchingWithCaseClasses extends App {
  def doCalculation(op: Operator): Unit = {
    op match {
      case Add(op1, op2) => println(s"${op1} + ${op2} = ${op1 + op2}")
      case Sub(op1, op2) => println(s"${op1} - ${op2} = ${op1 - op2}")
      case Mul(op1, op2) => println(s"${op1} x ${op2} = ${op1 * op2}")
      case Div(op1, 0) => println(s"-----error") // another way of dealing with divided by zero
      case Div(op1, op2) => if (op2 == 0) println("Error: divided by zero") else println(s"${op1} / ${op2} = ${op1 / op2}")
    }
  }

  doCalculation(Add(1, 2))
  doCalculation(Sub(9, 2))
  doCalculation(Mul(3, 2))
  doCalculation(Div(8, 2))
  doCalculation(Div(1, 0))
}
