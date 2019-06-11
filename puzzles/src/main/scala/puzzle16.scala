/**
  *
  * @author Richard Li
  */
object puzzle16 extends App {
  implicit val z1 = 2
  def add(x: Int)(y: Int)(implicit z: Int) = x + y + z
  def addTo(n: Int) = add(n) _  // implicit value determined when this method gets compiled

  implicit  val z2 = 3
  val addTo1 = addTo(1)
  println(addTo1(2))
 // println(addTo1(2)(3)) error
}
