/**
  *
  * @author Richard Li
  */
object puzzle10 extends App {
  var x = 0
  lazy val y = 1 / x
  try {
    println(y)
  } catch {
    case _: Exception =>
      x = 1
      println(y)
  }
}
/*
Scala will reattempt to initialize lazy vals on
each access until initialization succeeds. This
makes them a useful option for postponed
resource initialization.
 */
