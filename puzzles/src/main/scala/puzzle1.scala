/**
  *
  * @author Richard Li
  */
object puzzle1 extends App {
  println(List(1, 2).map { i => println("Hi"); i + 1 })
  println("=================")
  println(List(1, 2).map { println("Hi"); _ + 1 })
  println("=================")
  // error: println(List(1, 2).map { println("Hi"); (_: Int) + 1; "Hi" })
  println("=================")
  val func1 = (i: Int) => {println("Hi"); i + 1}
  val func2 = {i: Int => println("Hi"); i + 1}
  val func3 = { println("Hi"); (_: Int) + 1}
  val func4 = { println("Hi"); (_: Int) + 1; "Hi"}
  println(func1)
  println(func2)
  println(func4)
}
