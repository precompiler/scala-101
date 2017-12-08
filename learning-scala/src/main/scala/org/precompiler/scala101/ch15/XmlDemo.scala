package org.precompiler.scala101.ch15

/**
  *
  * @author Richard Li
  */



import scala.xml.Elem

object XmlDemo extends App {
  val employees =
    <employees>
      <employee dept="IT"><name>Scott</name></employee>
      <employee dept="IT"><name>Tiger</name></employee>
      <employee dept="HR"><name>Jane</name></employee>
    </employees>
  println(employees.getClass)

  println(employees \ "employee")

  (employees \ "employee").map(node => (node \ "@dept").text).distinct.foreach(println)

  def dummy(x: Any): Unit = {
    x match {
      case <employees>{emps @ _*}</employees> => println(s"==> ${emps}")
      case <employee>{nameTag @ _*}</employee> =>{
        val emp = x.asInstanceOf[Elem]
        println(s"==> ${(emp \ "@dept").text} ${nameTag.text}")
      }
    }
  }

  dummy(employees)

  dummy((employees \ "employee")(0))
}
