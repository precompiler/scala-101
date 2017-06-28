package org.precompiler.scala101.ch05

/**
  *
  * @author Richard Li
  */
object FundamentalTypes {
  def main(args: Array[String]): Unit = {
    Set("test", "hack").foreach(e => {
      val comment = commentOnPractice(e)
      val commentText = comment.getOrElse("No comments found")
      println(commentText)

      val ret = compute(100)
      ret match {
        case Right(value) => println(value)
        case Left(err) => println(err)
      }
    })
  }


  def commentOnPractice(input: String) = {
    if (input == "test") {
      Some("good")
    } else {
      None
    }
  }

  def compute(input: Int): Either[String, Double] = {
    if (input > 0) {
      Right(math.sqrt(input))
    } else {
      Left("Invalid input")
    }
  }
}
