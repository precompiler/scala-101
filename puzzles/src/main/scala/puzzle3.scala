/**
  *
  * @author Richard Li
  */
object puzzle3 extends App {
  trait A {
    val tag: String = "Hello"
    println("trait A, tag:" + tag)
  }

  trait AA {
    val label: String
    println("trait AA, label:" + label)
  }

  class B(t: String) extends A {
    override val tag = t
    println("Class B, tag:" + tag)
  }

  class C(override val tag:String) extends A {
    println("class C, tag:" + tag)
  }

  new C("Hello C")
  new B("Hello B")

  // initialized from left to right
  class Dummy(override val tag: String) extends  {
    override val label: String = {println("Dummy initializing"); "dummy label"}
  } with A with AA {
    println("In dummy body tag:" + tag)
  }

  new Dummy("Dummy")
  println("==============")
  class Dummy2(override val tag: String) extends  {
    override val label: String = {println("Dummy initializing"); "dummy label"}
  } with AA with A {
    println("In dummy body tag:" + tag)
  }
  new Dummy2("Dummy2")
}
