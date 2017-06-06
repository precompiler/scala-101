package org.precompiler.scala101.ch03

/**
  *
  * @author Richard Li
  */
object AccessModifier {
  def main(args: Array[String]): Unit = {
    val microwave = new Microwave
    //Compile error
    //microwave.turnTable;
  }
}

class Microwave {
  def start(): Unit = println("started")

  def stop(): Unit = println("stopped")

  private def turnTable(): Unit = println("turning table")
}

class Vehicle {
  //protected is class level - from an instance method
  //of a class we can access the members decorated as protected on
  //ANY instance of the same class
  protected def checkEngine() {}
}

class Car extends Vehicle {
  def start(): Unit = {
    checkEngine()
  }

  def tow(vehicle: Vehicle): Unit = {
    //Compile error
    //vehicle.checkEngine()
  }

  def tow(car: Car): Unit = {
    car.checkEngine()
  }
}

class GasStation {
  def fillGas(vehicle: Vehicle): Unit = {
    //Compile error
    //vehicle.checkEngine()
  }
}