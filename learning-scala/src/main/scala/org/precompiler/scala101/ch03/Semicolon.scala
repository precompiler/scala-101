package org.precompiler.scala101.ch03

import java.util

/**
  *
  * @author Richard Li
  */
object Semicolon extends App{
  val list1 = new util.ArrayList[Int]
  {
    println(s"list1, type: ${this.getClass}")
  }

  val list2 = new util.ArrayList[Int];
  {
    println(s"list2, type: ${list2.getClass}")
  }
}
