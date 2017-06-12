package org.precompiler.scala101.ch04

/**
  *
  * @author Richard Li
  */
class Person(val firstName: String, val lastName: String) {
  var position: String = _

  def this(firstName: String, lastName: String, position: String) {
    this(firstName, lastName)
    this.position = position
  }

  override def toString(): String = {
    s"Person[firstName = ${firstName}, lastName = ${lastName}, position = ${position}]"
  }
}

object PersonTest {
  def main(args: Array[String]): Unit = {
    val scott = new Person("Scott", "Tiger")
    val john = new Person("John", "Doe", "SA")
    println(scott)
    println(john)
  }
}