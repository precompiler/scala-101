package org.precompiler.scala101.ch03

/**
  *
  * @author Richard Li
  */
object DefaultParameterValue extends App {
  def log(content: String, level: String = "INFO"): Unit = {
    println(s"[${level}] -- ${content}")
  }

  log("Hello World")
  log("Hello again", "DEBUG")

  def sendMail(message: String, from: String = "scott.tiger@fmr.com", to: String = "st@gmail.com"): Unit = {
    println(s"send mail from ${from} to ${to}, content -> ${message}")
  }

  sendMail("Build triggered")
  sendMail("Application deployed", "st@mail.com")
  sendMail("Application deployed", to = "st@mail.com")
}
