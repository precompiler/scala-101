package org.precompiler.scala101.ch13

import java.io.File

import akka.actor.{Actor, ActorSystem, Props}
import akka.routing.RoundRobinPool

/**
  *
  * @author Richard Li
  */
object AkkaConcurrencyDemo extends App {
  val system = ActorSystem("FileCounter")
  val counter = system.actorOf(Props[FileCounter])
  counter ! "D:/localrepo"
}

class FileVisitor extends Actor {
  override def receive: Receive = {
    case dirPath: String => {
      var fileCnt = 0L
      val file = new File(dirPath)
      val children = file.listFiles()
      if (children != null) {
        children.filter(_.isDirectory).foreach(sender ! _.getAbsolutePath)
        fileCnt = children.count(!_.isDirectory)
      }
      sender ! fileCnt
    }
  }
}

class FileCounter extends Actor {
  var pending = 0
  var fileCnt = 0L
  val fileVisitors = context.actorOf(RoundRobinPool(100).props(Props[FileVisitor]))
  override def receive: Receive = {
    case dirPath: String => {
      pending += 1
      fileVisitors ! dirPath
    }
    case cnt: Long => {
      fileCnt += cnt
      pending -= 1
      if (pending == 0) {
        println(s"Total file count: ${fileCnt}")
        context.system.terminate()
      }
    }
  }
}