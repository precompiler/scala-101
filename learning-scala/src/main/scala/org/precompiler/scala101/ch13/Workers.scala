package org.precompiler.scala101.ch13

import akka.actor.{Actor, ActorSystem, Props}

/**
  *
  * @author Richard Li
  */
object Workers extends App {
  val system = ActorSystem("Demo")
  val actor = system.actorOf(Props[Worker])
  val actor2 = system.actorOf(Props[Worker])
  actor ! "Hello World!"
  actor ! "This"
  actor2 ! "is"
  actor2 ! "a test"
  system.terminate()
}

class Worker extends Actor {
  override def receive: Receive = {
    case message => println(s"Message received: ${message} -- ${Thread.currentThread().getName}")
  }
}
