package org.precompiler.scala101.ch04

/**
  *
  * @author Richard Li
  */
class Car(val year: Int) {
  private var milesDriven: Int = 0
  def miles(): Int = milesDriven
  def drive(distance: Int): Unit = {
    milesDriven += distance
  }
}

object CarTest {
  def main(args: Array[String]): Unit = {
    val car = new Car(2017)
    println(s"Miles driven ${car.miles()}")
    car.drive(5000)
    println(s"Miles driven ${car.miles()}")
  }
}
