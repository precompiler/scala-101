package org.precompiler.scala101.ch11

import scala.util.control.TailCalls._
import scala.io.Source._

/**
  *
  * @author Richard Li
  */
object TrampolineTCO extends App {
  def explore(count: Int, words: List[String]): TailRec[Int] = {
    if(words.size == 0)
      done(count)
    else
      tailcall(countPalindrome(count, words))
  }

  def countPalindrome(count: Int, words: List[String]): TailRec[Int] = {
    val (firstWord, remains) = (words.head, words.tail)
    if (firstWord.reverse == firstWord)
      tailcall(explore(count + 1, remains))
    else
      tailcall(explore(count, remains))
  }

  println(explore(0, List("mom", "dad", "racecar")).result)

  println(explore(0, fromURL("https://en.wikipedia.org/wiki/Palindrome").mkString.split(" ").toList).result)
}
