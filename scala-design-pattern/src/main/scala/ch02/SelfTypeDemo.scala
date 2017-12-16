package ch02

/**
  *
  * @author Richard Li
  */
object SelfTypeDemo extends App {
  //compilation error, TestCase1 must extend TestBase
  //val tc1 = new TestCase1() with DBTest
  val tc2 = new TestCase1 with DBTest2 with CommonTest //CommonTest must be mixed in
}


class TestBase {

}

trait CommonTest {

}

trait DBTest extends TestBase {

}

trait DBTest2 {
  self: CommonTest =>
}

class TestCase1 {

}