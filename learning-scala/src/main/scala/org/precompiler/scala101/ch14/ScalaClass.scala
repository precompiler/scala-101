package org.precompiler.scala101.ch14

/**
  *
  * @author Richard Li
  */
abstract class ScalaClass {
  def dummy(): Unit
}

abstract class ScalaClassThrow {
  @throws(classOf[DummyException]) // use @throws annotation to explicitly declare exception
  def dummy(): Unit
}

class DummyException extends Exception {

}