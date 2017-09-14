package org.precompiler.scala101.ch06

import java.util.Date

/**
  * Created by RL on 9/14/17.
  */
object PartiallyAppliedFunction extends App{
  def log(date: Date, message: String): Unit = {
    println(s"Date: ${date} -- ${message}")
  }
  val d = new Date()
  log(d, "msg 1")
  log(d, "msg 2")
  val logNow = log(new Date(), _: String)
  logNow("msg 3")
  logNow("msg 4")
}
