/**
  *
  * @author Richard Li
  */
object puzzle17 extends App {
  def methodA(u: Unit) = "Unit"
  def methodA(u: Unit, n: Nothing) = "Unit and Nothing"
  def methodB(u: Unit) = "Unit"
  def methodB(n: Nothing) = "Nothing"

  println(methodA(99))
  //println(methodB(99))
}
