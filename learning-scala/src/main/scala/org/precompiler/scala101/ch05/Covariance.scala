package org.precompiler.scala101.ch05



/**
  *
  * @author Richard Li
  */
object Covariance {
  def main(args: Array[String]): Unit = {
    val dogs = Array(new Dog("a"), new Dog("b"))
    //workWithPets(dogs) error
    playWithPets(dogs)

    val strs = Array("a")
    playWithAnything(strs)
    playWithAnything(dogs)

    var l1 = new MyList[Dog]()
    var l2:MyList[Pet] = null
    l2 = l1
    println(l2)
  }

  def workWithPets(pets: Array[Pet]): Unit = {

  }

  def playWithPets[T <: Pet](pets: Array[T]): Unit = {
    pets.foreach(println)
  }


  def playWithAnything(pets: Array[_]): Unit = {
    pets.foreach(println)
  }

}

class Pet(val name: String) {
  override def toString: String = name
}

class Dog(name: String) extends Pet(name)

class MyList[+T] {

}


