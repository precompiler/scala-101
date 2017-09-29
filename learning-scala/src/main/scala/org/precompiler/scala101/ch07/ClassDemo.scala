package org.precompiler.scala101.ch07

/**
  * Created by RL on 9/29/17.
  */
object ClassDemo extends App{
  val aw = new Laptop(new Gtx1080())
  aw.start()

  val brokenLaptop = new Laptop(new BrokenVideoCard())
  brokenLaptop.start()

  val testingLaptop = new Laptop(new TestVideoCard("TC"))
  testingLaptop.start()

  ///////////////////
  val b = new B()
  println(b.x)
  println(b.y)
}

class VideoCard(val brand: String) {
  def init(): Unit = {
    println(s"starting video card ${brand}")
  }
}

class BrokenVideoCard extends VideoCard("Unknown") {
  override def init(): Unit = {
    println(s"failed to start video card ${brand}")
  }
}

class TestVideoCard(val b: String) extends VideoCard(b)
class Gtx1080(override val brand: String = "GTX1080") extends VideoCard(brand) {

}


class Laptop(val videoCard: VideoCard) {
  def start():Unit = {
    videoCard.init()
  }
}

class A {
  val x: String = "x"
  var y: String = "y"
}

class B extends A {
  var z: String = x
  y = "y1"
  val y1: String = y
}


