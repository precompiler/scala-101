/**
  *
  * @author Richard Li
  */
import collection.mutable.Buffer

object puzzle6 extends App {
  val buf1 = Buffer.empty[() => Int]
  val buf2 = Buffer.empty[() => Int]
  val buf3 = Buffer.empty[() => Int]

  val data = Seq(10, 20, 30)
  var j = 0

  for (i <- 0 until data.length) {
    buf1 += (() => data(i))
    buf2 += (() => data(j))
    val valJ = j
    buf3 += (() => data(valJ))
    j += 1
  }
  buf1.foreach(f => println(f()))
  println("================")
  buf3.foreach(f => println(f()))
  println("================")
  // index out of boundary
  // in a closure, val is stored as a regular Int, but var is stored as a ref to Int
  buf2.foreach(f => println(f()))


}
