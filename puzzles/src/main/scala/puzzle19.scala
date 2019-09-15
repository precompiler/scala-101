/**
  *
  * @author Richard Li
  */
object puzzle19 extends App {
  def overloadA(u: Unit) = "unit"
  def overloadA(u: Unit, n: Nothing) = "unit & nothing"
  def overloadB(n: Unit) = "unit b"
  def overloadB(n: Nothing) = "nothing b"

  // compile error
  // println(overloadA 99)
  // println(overloadB 99)
}
