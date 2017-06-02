package org.precompiler.scala101.ch03

/**
  * Created by RL on 6/2/17.
  */
object StringDemo {
  def main(args:Array[String]): Unit = {
    val multilineStr =
      """
        SELECT *
          FROM dual;
      """
    val multilineStr2 =
      """
        |SELECT *
        |FROM emp;
      """.stripMargin
    println(multilineStr)
    println(multilineStr2)

    val discount = 10
    val price = 100
    println(s"Discount is ${discount}%")
    println(s"Price is $$${price * 0.9}")
  }
}
