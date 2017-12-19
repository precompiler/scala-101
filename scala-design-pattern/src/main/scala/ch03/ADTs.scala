package ch03

/**
  *
  * @author Richard Li
  */
object ADTs extends App {
  val month = Dec
  println(month)
  val black = RGB(0, 0, 0)
  println(black)
}

/*Sealed class/trait can be extended only in the same source where sealed class/trait is defined*/
sealed abstract trait Month
case object Jan extends Month
case object Feb extends Month
case object Mar extends Month
case object Apr extends Month
case object May extends Month
case object Jun extends Month
case object Jul extends Month
case object Aug extends Month
case object Sept extends Month
case object Oct extends Month
case object Nov extends Month
case object Dec extends Month

sealed case class RGB(r: Int, g: Int, b: Int)