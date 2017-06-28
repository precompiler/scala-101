package org.precompiler.scala101.ch05

import java.util.ArrayList

/**
  *
  * @author Richard Li
  */
object TypeInference {
  def main(args: Array[String]): Unit = {
    var list1 = new ArrayList
    //compilation error
    //if parametric type is omitted, type "Nothing" will be used
    //list1.add("")
    var list2 = new ArrayList[String]
    list2.add("elem1")
  }
}
