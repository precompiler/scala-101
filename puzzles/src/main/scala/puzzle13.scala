/**
  *
  * @author Richard Li
  */
object puzzle13 extends App {
  def sumUp: Int = {
    def one(x: Int): Int = {
      return x;1
    }
    // funny one
    // A return expression "return e" must occur inside the body of
    // some enclosing named method or function. The return
    // expression evaluates the expression e and returns its value as the
    // result of method/function.
    // only methods and local functions (defs) can
    //  act as the enclosing scope of return statements
    // below return will return value for sumUp...
    val two = (x: Int) => { return x; 20}

    1 + one(2) + two(100)

  }
  println(s"final result: ${sumUp}")
}


