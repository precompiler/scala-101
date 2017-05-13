package org.precompiler.scala101.ch03

/**
  *
  * @author Richard Li
  */
object Tuples extends App{
  def getPersonInfo(id: Int) = {
    ("Scott", "Tiger", "Scott.Tiger@oracle.com")
  }
  val (firstName, lastName, email) = getPersonInfo(1)
  println(s"First Name: ${firstName}, Last Name: ${lastName}, Email: ${email}")

  //Compilation error
  //val (firstName1, lastName1) = getPersonInfo(1)

  //Runtime error
  //val (firstName1, lastName1, email1, dummy) = getPersonInfo(1)
}
