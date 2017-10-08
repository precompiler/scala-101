package org.precompiler.scala101.ch07

/**
  *
  * @author Richard Li
  */
object MethodLateBinding extends App{
  val writer1 = new StringWriter with UpperCaseWriter with TagWriter

  val writer2 = new StringWriter with TagWriter with UpperCaseWriter

  writer1.write("hello world")

  writer2.write("hello world")
}


abstract class Writer {
  def write(message: String): Unit
}

class StringWriter extends Writer{
  val writer = new java.io.StringWriter
  override def write(message: String): Unit = {
    writer.write(message)
    println(writer.toString)
  }
}

trait UpperCaseWriter extends Writer {
  abstract override def write(message: String): Unit = {
    if (message != null) {
      super.write(message.toUpperCase)
    }
  }
}

trait TagWriter extends Writer {
  abstract override def write(message: String): Unit = {
    if (message != null) {
      super.write(s"<tag>${message}</tag>")
    }
  }
}