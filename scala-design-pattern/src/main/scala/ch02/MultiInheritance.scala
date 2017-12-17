package ch02

/**
  *
  * @author Richard Li
  */
object MultiInheritance extends App {
  // val x = new Object() with A with B inherits conflicting members
  val c = new Object() with A with B {
    override def greeting(): Unit = super.greeting()
  }
  c.greeting()

  val d = new Object() with B with A {
    override def greeting(): Unit = super.greeting()
  }
  d.greeting()

  val e = new Object() with B with A {
    override def greeting(): Unit = {
      println("==============================")
      super[A].greeting()
      super[B].greeting()
      println("==============================")
    }
  }
  e.greeting()

  val x = new Object() with ChildA with ChildB
  x.hello()

  val y = new Object() with ChildB with ChildA
  y.hello()
}

trait A {
  def greeting(): Unit = {
    println("Greeting from A")
  }
}

trait B {
  def greeting(): Unit = {
    println("Greeting from B")
  }
}

trait Common {
  def hello(): Unit = println("Hello from Common")
}

trait ChildA extends Common {
  override def hello(): Unit = println("Hello from ChildA")
}

trait ChildB extends Common {
  override def hello(): Unit = println("Hello from ChildB")
}

