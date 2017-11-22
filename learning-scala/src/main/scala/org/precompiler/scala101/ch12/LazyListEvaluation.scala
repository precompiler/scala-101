package org.precompiler.scala101.ch12

/**
  *
  * @author Richard Li
  */
object LazyListEvaluation extends App {
  def departments = List(("Sales", 50), ("Development", 200), ("HR", 30), ("Finance", 10))
  def hasMoreThan20Employees(department: (String, Int)): Boolean = {
    println(s"::hasMoreThan20Employees -> ${department}")
    val (_, empNo) = department
    empNo > 20
  }
  def departmentNameStartsWithD(department: (String, Int)): Boolean = {
    println(s"departmentNameStartsWithD -> ${department}")
    val (name, _) = department
    name.startsWith("D")
  }
  println(departments.filter(hasMoreThan20Employees).filter(departmentNameStartsWithD))

  println("=================================")

  println(departments.view.filter(hasMoreThan20Employees).filter(departmentNameStartsWithD).toList)

}
