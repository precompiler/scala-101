package org.precompiler.scala101.ch13

import akka.actor.{Actor, ActorSystem, Props}

import scala.collection.mutable.Map
import akka.pattern.ask
import akka.util.Timeout

import scala.concurrent.Await
import scala.concurrent.duration._

/**
  *
  * @author Richard Li
  */
object AkkaDemo extends App {
  val system = ActorSystem("Demo")
  val actor = system.actorOf(Props[Worker])
  val actor2 = system.actorOf(Props[Worker])
  actor ! "Hello World!"
  actor ! "This"
  actor2 ! "is"
  actor2 ! "a test"
  system.terminate()
  //////////////////////////////
  val system2 = ActorSystem("Counter")
  val counter = system2.actorOf(Props[WebpageVisitCounter])
  counter ! Page("/index.html")
  counter ! Page("/login")
  counter ! Page("/index.html")
  counter ! Page("/error")

  implicit val timeout = Timeout(2.seconds)
  val qryFuture1 = counter ? PageStat("/index.html")
  val qryFuture2 = counter ? PageStat("/login")
  val qryFuture3 = counter ? PageStat("/dummy")

  println(Await.result(qryFuture1, timeout.duration))
  println(Await.result(qryFuture2, timeout.duration))
  println(Await.result(qryFuture3, timeout.duration))
  system2.terminate()
}

class Worker extends Actor {
  override def receive: Receive = {
    case message => println(s"Message received: ${message} -- ${Thread.currentThread().getName}")
  }
}

case class Page(val url: String)
case class PageStat(val url: String)
class WebpageVisitCounter extends Actor {
  val cache = Map[String, Int]()
  override def receive: Receive = {
    case Page(url) => {
      val cnt = cache.getOrElse(url, 0)
      cache.update(url, cnt + 1)
    }
    case PageStat(url) => sender ! cache.get(url)
  }
}
