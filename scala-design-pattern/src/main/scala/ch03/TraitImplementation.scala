package ch03

/**
  *
  * @author Richard Li
  */
object TraitImplementation extends App with Bar {

}


trait Foo {
  def methodA: String
  def methodB: String
}

trait Bar extends Foo {
  val methodA = "Hello World" //a variable with the same name as a method will also be considered as implementation
  override def methodB: String = "" //override a method
}