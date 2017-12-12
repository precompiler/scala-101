package ch02

/**
  *
  * @author Richard Li
  */
object TraitAndMixin extends App {
  val notifier = new NotifierImpl("Hello")
  notifier.printMessage()
  notifier.clear()

  val conn = new JdbcConnector()
  conn.connect()
  conn.close()
}

trait Notifier {
  var message: String
  def printMessage(): Unit = {
    println(message)
  }

  def clear()
}

class NotifierImpl(override var message: String) extends Notifier {

  override def clear(): Unit = {
    println(s"Clear message ${message}")
  }
}

abstract class Connector {
  def connect(): Unit
  def close(): Unit
}

class JdbcConnector extends Connector {
  override def connect(): Unit = {
    println("Connect to Database")
  }

  override def close(): Unit = {
    println("Disconnect from Database")
  }
}