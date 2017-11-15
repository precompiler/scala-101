package org.precompiler.scala101.ch10

/**
  *
  * @author Richard Li
  */
object ExceptionHandling extends App {
  def setSpeedLimit(kph: Int): Unit = {
    if (kph < 0) {
      throw new IllegalArgumentException("speed must be greater or equals zero")
    } else if (kph > 200) {
      throw new RuntimeException("speed overflow")
    } else {
      println(s"Set speed to ${kph} kph")
    }
  }

  def doChange(kph: Int): Unit = {
    try {
      setSpeedLimit(kph)
    } catch {
      case ex: IllegalArgumentException => println(ex.getMessage)
      case ex: RuntimeException => println(ex.getMessage)
      case _: Throwable => println("Error")
    } finally {
      println("-----------")
    }
  }

  doChange(-1)
  doChange(100)
  doChange(9000)
}
