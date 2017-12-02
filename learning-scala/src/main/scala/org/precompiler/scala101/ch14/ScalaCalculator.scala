package org.precompiler.scala101.ch14

/**
  *
  * @author Richard Li
  */
class ScalaCalculator {
  def doCalc(a: Long, b: Long, f: (Long, Long) => Long): Long = {
    f(a, b)
  }
}
