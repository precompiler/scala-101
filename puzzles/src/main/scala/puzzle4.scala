/**
  *
  * @author Richard Li
  */
object puzzle4 extends App {
  def howManyElements(collections: Iterable[Iterable[_]]): Int = {
    collections.map(_.size).sum
  }
  // we can get right answers
  println(howManyElements(List(List(1, 2, 3), List(4, 5, 6))))
  println(howManyElements(Set(List(1, 2, 3), List(4, 5, 6, 7))))

  // wrong answer now!
  // input type is preserved in scala not like java. Java will erase underlying type.
  println(howManyElements(Set(List(1, 2, 3), List(4, 5, 6))))
  // following logic equals what's happening inside the method
  // x == Set(3, 3) == Set(3)
  val x = Set(List(1, 2, 3), Set(4, 5, 6)).map(_.size)
  println(x)

  def howManyElementsFix(collections: Iterable[Iterable[_]]): Int = {
    collections.toSeq.map(_.size).sum
  }
  println(howManyElementsFix(List(List(1, 2, 3), List(4, 5, 6))))
  println(howManyElementsFix(Set(List(1, 2, 3), List(4, 5, 6, 7))))
  println(howManyElementsFix(Set(List(1, 2, 3), List(4, 5, 6))))
}
