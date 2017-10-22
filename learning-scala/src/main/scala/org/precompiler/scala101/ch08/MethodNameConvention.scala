package org.precompiler.scala101.ch08

/**
  *
  * @author Richard Li
  */
object MethodNameConvention extends App{
  val axe = new Axe()
  val thor = new Hero("Thor")
  thor + axe //where is the hammer
  val sword = new Sword()
  sword +: thor

  sword isThrownAwayBy_: thor

  val rifle = new SniperRifle()
  +rifle
  -rifle
  !rifle
  ~rifle
  rifle !
}

class Weapon {}
class Axe extends Weapon {}
class Sword extends Weapon {}

class Hero(val name: String) {
  def +(weapon: Weapon): Unit = {
    println(s"${name} equipped with ${weapon.getClass.getSimpleName}")
  }

  def +:(weapon: Weapon): Unit = {
    println(s"${name} equipped with ${weapon.getClass.getSimpleName}")
  }

  //def illegal:(weapon: Weapon): Unit = {} no alphabet allowed before special operator
  def isThrownAwayBy_:(weapon: Weapon): Unit = {
    println(s"${weapon.getClass.getSimpleName} was thrown away by ${name}")
  }
}

class SniperRifle {
  def unary_+() = println("Zoom in")
  def unary_-() = println("Zoom out")
  def unary_!() = println("Fire!")
  def unary_~() = println("Reload")
  //def unary_~(weapon: Weapon) = println(s"Fuse with ${weapon.getClass.getSimpleName}") no way to call unary with parameter
  def !() = println("f")
}