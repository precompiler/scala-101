/**
  *
  * @author Richard Li
  */
object puzzle7 extends App {
  val seqInSeq = Seq(Seq("a", "b", "c"), Seq("d", "e", "f"), Seq("g", "h"), Seq("i", "j", "k"))
  val seqList = for (Seq(x, y, z) <- seqInSeq) yield x + y + z
  //val obj = seqInSeq.map{ case Seq(x, y, z) => x + y + z} // error
  println(seqList)
  // 0 to 10 is actually a generator, left hand side of assignment is a pattern
  val x = for( i@j <- 0 to 10) yield i + j
  println(x)

  // val seqList = for (Seq(x, y, z) <- seqInSeq) yield x + y + z will be desugared to following statement
  val eq = seqInSeq.withFilter{
    case Seq(x, y, z) => true
    case _ => false
  }.map{
    case Seq(x, y, z) => x + y + z
  }

  println(eq)
}
