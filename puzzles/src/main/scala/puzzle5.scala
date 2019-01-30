/**
  *
  * @author Richard Li
  */
object puzzle5 extends App {
  def applyMultipleTimes[T](n: Int)(arg: T, f: T => T) = (1 to n).foldLeft(arg) {
    (a, _) => f(a)
  }

  def applyMultipleTimesCurried[T](n: Int)(arg: T)(f: T => T) = (1 to n).foldLeft(arg) {
    (a, _) => f(a)
  }

  def incOne(n: Int) = n + 1

  def nextNumber[T](n: T)(implicit numericOps: Numeric[T]) = numericOps.plus(n, numericOps.one)

  println(applyMultipleTimes(3)(2, incOne))
  println(applyMultipleTimesCurried(3)(2)(incOne))
  println(applyMultipleTimes(3)(2.0, nextNumber[Double]))
  //println(applyMultipleTimes(3)(2.0, nextNumber)) //error
  println(applyMultipleTimes[Double](3)(2.0, nextNumber))
  println(applyMultipleTimesCurried(3)(2.0)(nextNumber))

//  Information about a type parameter is available
//  only to subsequent parameter lists in a curried
//    invocation, not to other parameters in the same
//  list. When defining methods with parameters
//  whose type constraints can only be satisfied if
//  the type bindings for earlier parameters of the
//    same method are known, use curried method
//  definitions rather than single parameter lists.
}
