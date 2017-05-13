package org.precompiler.scala101.ch03

/**
  *
  * @author Richard Li
  */
object ScalaGreetings extends App{
  for (i <- 1 to 3) {
    print(s"$i, ")
  }
  println("Scala Rocks!!!")

  for (i <- 1 until 3) {
    print(s"$i, ")
  }
}
