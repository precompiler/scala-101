/**
  *
  * @author Richard Li
  */
object puzzle2 extends App{
  var MONTH = 12
  var DAY = 24
  // compile error
  // var (HOUR, MINUTE, SECOND) = (1, 2, 3)
  // multi variable assignment is based on pattern matching
  // variable name starts with capital letter has special meaning
  val five = 5
  def isNumber5(x: Int): Unit = {
    x match {
      case  five => println("Yes")
      case _   => println("No")
    }
  }
  isNumber5(1) // gives wrong answer
  val Six = 6
  def isNumber6(x: Int): Unit = {
    x match {
      case Six => println("Yes")
      case _ => println("No")
    }
  }
  isNumber6(1)
  isNumber6(6)

  val seven = 7
  def isNumber7(x: Int): Unit = {
    x match {
      case `seven` => println("Yes")
      case _ => println("No")
    }
  }
  isNumber7(1)
  isNumber7(7)

  var (hOUR, mINUTE, sECOND) = (1, 2, 3)
  println(hOUR, mINUTE, sECOND)
}
