package org.precompiler.scala101.ch05

/**
  *
  * @author Richard Li
  */
object Contravariance {
  def main(args: Array[String]): Unit = {
    val dogs = Array(new Dog("a"), new Dog("b"))
    val pets = new Array[Pet](dogs.length)
    copyPets(dogs, pets)
    pets.foreach(println)
  }

  def copyPets[S, D >: S](from: Array[S], to: Array[D]): Unit = {
    var idx = 0
    for (item <- from) {
      to(idx) = item
      idx += 1
    }
  }
}
