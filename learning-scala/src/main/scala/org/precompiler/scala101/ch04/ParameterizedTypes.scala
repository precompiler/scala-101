package org.precompiler.scala101.ch04

/**
  *
  * @author Richard Li
  */
object ParameterizedTypes {
  def main(args: Array[String]): Unit = {
    def echo[T](input: T): Unit = {
      println(s"Input type is ${input.getClass}")
    }

    def echo2[T](a: T, b: T): Unit = {
      println(s"Input 1 type: ${a.getClass}, Input 2 type: ${b.getClass}")
    }

    echo("String")
    echo(1)
    echo(1l)
    echo(1.1d)
    //tuple
    echo("a", "b")
    echo(("a", "b"))
    echo(1, 2)

    echo2(1, 1)
    //will also work, as String and Double are both derived from Any
    echo2("a", 2.2d)
    //compile error
    //echo2[String]("a", 2.2d)
  }
}
