package org.precompiler.scala101.ch03

/**
  * Created by RL on 6/2/17.
  */
object OperatorOverriding {
  def main(args: Array[String]): Unit = {
    val c1 = new Complex(1, 2)
    val c2 = new Complex(2, 3)
    println(c1 + c2)

    val d1 = new Dummy("a")
    val d2 = new Dummy("b")
    val d3 = new Dummy("c")
    println(d1 + d2 * d3)
    println(d1 .^: ("xxx"))
    println("xxx" ^: d2)

    //println("xxx" && d1)
  }
}

class Complex(val real: Int, val imaginary: Int) {
  def +(operand: Complex): Complex = {
    new Complex(real + operand.real, imaginary + operand.imaginary)
  }

  override def toString(): String = {
    val sign = if (imaginary < 0) "" else "+"
    s"$real$sign${imaginary}i"
  }
}

class Dummy(val w: String) {
  def +(d: Dummy): Dummy = {
    println("+")
    new Dummy(w + d.w)
  }

  def *(d: Dummy): Dummy = {
    println("*")
    new Dummy(w + d.w)
  }
  def ^:(d: String): Dummy = {
    new Dummy(d + w)
  }
  override def toString: String = w
}
