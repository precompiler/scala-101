package org.precompiler.scala101.ch04

import scala.collection.mutable._

/**
  *
  * @author Richard Li
  */
object Singleton {
  def main(args: Array[String]): Unit = {
    //private class constructor can be access in companion object
    //Marker2.test
  }
}

class Marker private(val color: String) {
  override def toString(): String = s"Color: ${color}"
}

object Marker {
  private val markers = Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "yellow" -> new Marker("yellow")
  )

  def supportedColors = markers.keys

  def apply(color: String): Marker = {
    markers.getOrElseUpdate(color, new Marker(color))
  }
}

object Marker2 {
  def test = {
    //not accessable
    //new Marker("abc")
  }
}