package org.precompiler.scala101.ch05

/**
  * Created by RL on 8/24/17.
  */
object CustomInterpolator {
  implicit class Interpolator(val context: StringContext) extends AnyVal{
    def mask(args: Any*): StringBuilder = {
      val processed = context.parts.zip(args).map { item =>
       val (text, expression) = item
        if(!text.endsWith(">"))
          s"${text}$expression"
        else
          s"${text.split(">")(0)}***${expression.toString takeRight 4}"
      }.mkString
      new StringBuilder(processed).append(context.parts.last)
    }
  }

  def main(args: Array[String]): Unit = {
    val a1 = "abc"
    val a2 = "aSecret"
    println(mask"a1 = ${a1} a2 =>${a2}")
  }
}
