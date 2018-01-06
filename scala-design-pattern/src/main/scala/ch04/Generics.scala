package ch04

/**
  *
  * @author Richard Li
  */
object Generics extends Adder with App {
  println(sum(1, 2))
}

trait Adder {
  def sum[T](a: T, b: T)(implicit numeric: Numeric[T]): T = numeric.plus(a, b)
}

class A[T](data: T) {
  def dummy(x: T) = data.equals(x)
}