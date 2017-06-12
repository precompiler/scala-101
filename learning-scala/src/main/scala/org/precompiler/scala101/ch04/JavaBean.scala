package org.precompiler.scala101.ch04

import scala.beans.BeanProperty
/**
  *
  * @author Richard Li
  */
class JavaBean(@BeanProperty val prop1: String, private val prop2: String) {
  @BeanProperty var prop3: String = _
  private var prop4: String = _
}

object JavaBeanTest {
  def main(args: Array[String]): Unit = {
    val bean = new JavaBean("prop1", "prop2")
    bean.setProp3("prop3")
    println(s"${bean.prop3}")
    println(s"${bean.getProp3}")
  }
}
