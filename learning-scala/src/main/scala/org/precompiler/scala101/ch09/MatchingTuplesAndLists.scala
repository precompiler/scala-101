package org.precompiler.scala101.ch09

/**
  *
  * @author Richard Li
  */
object MatchingTuplesAndLists extends App{
  def coordinatesToAddress(input: Any): Unit = {
    input match {
      case (lat, long) => println(s"Processing (${lat}, ${long})")
      case "!quit" => println("Bye")
      case i @ _ => println(s"Unknown input: ${i}")
    }
  }
  coordinatesToAddress((30.123, 65.009))
  coordinatesToAddress("Dummy")
  coordinatesToAddress((1, 2, 3, 4, 5))
  coordinatesToAddress("!quit")

  def imageRecognation(features: List[String]): Unit = {
    features match {
      case List("face", "2 eyes", "stand on 2 feet") => println("Human")
      case List("red", "green", "seeds inside") => println("Watermelon")
      case List("black", "in a glass", extra @ _*) => println(s"Need to learn more based on extra info: ${extra}")
      case unknown @ _ => println(s"Unknown: ${unknown}")
    }
  }

  imageRecognation(List("face", "2 eyes", "stand on 2 feet"))
  imageRecognation(List("red", "green", "seeds inside"))
  imageRecognation(List("black", "in a glass", "foamy", "popular")) // Guinness
  imageRecognation(List("dummy"))
}
