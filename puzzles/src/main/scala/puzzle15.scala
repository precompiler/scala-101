/**
  *
  * @author Richard Li
  */
object puzzle15 extends App {
  def foo(a: Int = 0, b: Int = 0): Unit = {
    println(s"$a, $b")
  }

  foo()
  foo(1, 2)
  foo(3)
  foo(b = 10)


  def invert(v3: Int)(v2: Int = 2, v1: Int = 1) {
    println(s"$v1, $v2, $v3")
  }

  val invert3 = invert(3) _

  // invert3(v1 = 2)  compile error, as invert3 won't have default values
  // invert3 equals to below function def
//  def invert3 = new Function2[Int, Int, Unit] {
//    override def apply(v1: Int, v2: Int): Unit = invert(3)(v1, v2)
//  }
    // v1 and v2 are revered!
  invert3(v1= 2, v2 = 1)
}
