/**
  *
  * @author Richard Li
  */
object puzzle18 extends App {
  class SimpleAdder {
    def add(x: Int = 1, y: Int = 2): Int = x + y
  }

  class Adder2 extends SimpleAdder {
    override def add(y: Int = 3, x: Int = 4): Int = super.add(x, y) + 10
  }

  class Adder3 extends SimpleAdder {
    override def add(x: Int = 4, y: Int = 3): Int = super.add(x, y) + 10
  }

  val adder2: SimpleAdder = new Adder2
  val adder3: SimpleAdder = new Adder3
  println(adder2.add(y = 0)) // => SimpleAdder#add(x, y = 0) => Adder2#add(3, 0) == 13. Java doesn't support default values for parameters, compiler needs to do the trick at compile time
  println(adder2.add(0))
  println(adder3.add(y = 0))
  println(adder3.add(0))
}
