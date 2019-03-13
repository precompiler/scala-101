/**
  *
  * @author Richard Li
  */
import collection.immutable.SortedSet
object puzzle11 extends App {
  case class RomanNumeral(symble: String, value: Int)

  implicit object RomanOrdering extends Ordering[RomanNumeral] {
    def compare(a: RomanNumeral, b: RomanNumeral) = {
      a.value.compare(b.value)
    }
  }

  val numbers = SortedSet(
    RomanNumeral("M", 1000),
    RomanNumeral("C", 100),
    RomanNumeral("I", 1),
    RomanNumeral("V", 5),
    RomanNumeral("X", 10)
  )

  for (num <- numbers; sym = num.symble) {
    println(sym)
  }
  //for loop desugared as foreach
  println("==")

  numbers.foreach(num => println(num.symble))
  println("==")
  numbers.map(_.symble).foreach(s => println(s)) // sorted map.foreach
  println("==")
}
//transformations, such as map, preserve the type of the collection

