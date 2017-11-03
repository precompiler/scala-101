package org.precompiler.scala101.ch08

/**
  * Created by RL on 10/28/17.
  */
object ForDemo extends App{
  for (i <- 1 to 10) {
    println(i)
  }

  val array = for (i <- 2 to 8) yield i
  println(array)

  val odds = for (i <- 1 to 10; if i % 2 != 0) yield i
  println(odds)

  val even = for {
    i <- 1 to 10
    if i % 2 == 0
  } yield i

  println(even)

  for (i <- 1 to 10; j <- 1 to 10) {
    print(s"(i=${i}, j=${j})")
  }
  println()

  val x = for {
    i <- 1 to 10
    j <- 1 to 10
    if i % 2 != 0
    if j % 2 ==0
  } yield (i, j)

  println(x)

  val people = List(Person("Scott", "Tiger"), Person("John", "Doe"), Person("Jane", "Doe"))

  val p = for(person <- people; firstName = person.firstName; lastName = person.lastName) yield s"${firstName} ${lastName}"
  println(p.mkString(","))
}

class Person(val firstName: String, val lastName: String)

object Person {
  def apply(firstName: String, lastName: String) = {
    new Person(firstName, lastName)
  }
}
