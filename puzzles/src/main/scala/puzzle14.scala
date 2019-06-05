
/**
  *
  * @author Richard Li
  */
object puzzle14 extends App {
  var x = 0
  def counter() = { println("counter invoked"); x += 1; x}
  def add(a: Int)(b: Int) = a + b
  println("====adder1====")
  val adder1 = add(counter)(_) // i => add(counter)(i) will evaluate at runtime
  println("====adder2====")
  val adder2 = add(counter) _ // partial applied function. counter will be eagerly called.

  println(s"x = $x")
  println(adder1(10))
  println(s"x = $x")
  println(adder2(10))
  println(s"x = $x")
}
