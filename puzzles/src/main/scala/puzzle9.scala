/**
  *
  * @author Richard Li
  */
import collection.immutable.HashSet
object puzzle9 extends App {
  def newInst() = new Country("CH") with HashCodeTracer

  def newDecl() = CountryWithTrace("CH")


  val countriesInst = HashSet(newInst)
  val countriesDecl = HashSet(newDecl)

  println(countriesInst.iterator.contains(newInst))
  println(countriesInst.contains(newInst))

  println(countriesDecl.iterator.contains(newDecl))
  println(countriesDecl.contains(newDecl))
}

trait HashCodeTracer {
  override def hashCode(): Int = {
    println(s"Getting HashCode ${this}")
    super.hashCode()
  }
}

case class Country(isoCode: String)

case class CountryWithTrace(isoCode: String) extends HashCodeTracer

