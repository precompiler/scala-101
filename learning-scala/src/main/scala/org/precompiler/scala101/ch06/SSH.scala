package org.precompiler.scala101.ch06

import java.util.Date

/**
  * Created by RL on 9/17/17.
  */
class SSH private (){
  private def time(start: Date): Unit = {
    println(s"Time elapsed: ${new Date().getTime - start.getTime}")
  }
  private def exec(command: String): Unit = {
    println(s"executing: ${command}")
  }
}

object SSH {
  def sh(command: String): Unit = {
    val ssh = new SSH()
    val start = new Date()
    try {
      ssh.exec(command)
    } finally {
      ssh.time(start)
    }
  }
}

object SSHDemo extends App {
  SSH.sh("ls")
  SSH.sh("docker ps")
}