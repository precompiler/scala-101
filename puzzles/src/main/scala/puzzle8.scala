/**
  *
  * @author Richard Li
  */
object puzzle8 extends App {
  println(if (math.random() > 0.5) XY.X.value else XY.Y.value)

  // println(XY.StackOverflow.x)

  println(XY.OK.y)
  println(XY.OK.x)

  println(XY.OK1.x)
  println(XY.OK1.y)


}

object XY {
  object X {
    // value defined by an object definition is instantiated lazily
    val value: Int = Y.value + 1
  }

  object Y {
    val value: Int = X.value + 1
  }

  object StackOverflow {
    lazy val x: Int = y + 1
    lazy val y: Int = x + 1
  }

  object OK {
    lazy val x: Int = y + 1
    val y: Int = x + 1
  }

  object OK1 {
    val x: Int = y + 1
    val y: Int = x + 1
  }
}
