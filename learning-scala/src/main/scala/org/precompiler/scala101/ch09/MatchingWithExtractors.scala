package org.precompiler.scala101.ch09

/**
  *
  * @author Richard Li
  */
object MatchingWithExtractors extends App {
  def process(input: String): Unit = {
    input match {
      case Command() => println(s"Processing command ${input}")
      case _ => println(s"Unknown input ${input}")
    }
  }

  def processCommandLine(input: String): Unit = {
    input match {
      case CommandLine(cmd, args) => println(s"cmd: ${cmd}, args: ${args}")
      case _ => println(s"Unknown command line: ${input}")
    }
  }

  def processCommandLineWithCheck(input: String): Unit = {
    input match {
      case CommandLine(cmd @ Command(), args) => println(s"-cmd: ${cmd}, args: ${args}")
      case _ => println(s"-Unknown command line: ${input}")
    }
  }

  process("ls")
  process("cd")
  process("dir")

  processCommandLine("ls")
  processCommandLine("cd ..")
  processCommandLine("rm -r")

  processCommandLineWithCheck("ls")
  processCommandLineWithCheck("cd ..")
  processCommandLineWithCheck("rm -r")
}

object Command {
  def unapply(input: String): Boolean = {
    if (input == "ls" || input == "cd") true else false
  }
}

object CommandLine {
  def unapply(input: String): Option[(String, String)] = {
    if (input != null) {
      if (input.trim.contains(" ")) {
        val tokens = input.trim.split(" ")
        Some((tokens(0), tokens(1)))
      } else {
        None
      }
    } else {
      None
    }
  }
}