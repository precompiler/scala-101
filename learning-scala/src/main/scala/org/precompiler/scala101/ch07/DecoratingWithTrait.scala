package org.precompiler.scala101.ch07

/**
  *
  * @author Richard Li
  */
object DecoratingWithTrait extends App{
  val check1 = new Check with CreditCheck with CriminalRecordCheck
  println(check1.check)

  val check2 = new Check with CriminalRecordCheck with EmploymentCheck
  println(check2.check)

  val milk = new Condiment with Milk
  println(milk.getPrice)

  val milkWithCoco = new Milk with Coco
  println(milkWithCoco.getPrice)

  val milkSoyMilkAndCoco = new Milk with Coco with SoyMilk
  println(milkSoyMilkAndCoco.getPrice)

}

abstract class Check {
  def check: String = "Check details"
}

trait CreditCheck extends Check {
  override def check: String = s"Checking credit ${super.check}"
}

trait EmploymentCheck extends Check {
  override def check: String = s"Checking employment ${super.check}"
}

trait CriminalRecordCheck extends Check {
  override def check: String = s"Checking criminal record ${super.check}"
}


abstract class Condiment {
  def getPrice: Double = 0
}

trait Milk extends Condiment {
  override def getPrice: Double = 1 + super.getPrice
}

trait Coco extends Condiment {
  override def getPrice: Double = 0.5 + super.getPrice
}

trait SoyMilk extends Condiment {
  override def getPrice: Double = 0.2 + super.getPrice
}