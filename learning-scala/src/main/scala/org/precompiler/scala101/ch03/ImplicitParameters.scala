package org.precompiler.scala101.ch03

/**
  *
  * @author Richard Li
  */
object ImplicitParameters {
  // global scope implicit variable
  implicit val vodafone = new Wifi("Vodafone")

  class Wifi(name: String) {
    override def toString: String = name
  }

  def connectToNetwork(user: String)(implicit wifi: Wifi): Unit = {
    println(s"User ${user} connected to WIFI ${wifi}")
  }

  def atOffice(): Unit = {
    println("----office----")
    // method scope implicit variable
    // will get ambiguous implicit values runtime exception if
    // multiple implicit values of the same type found in scope
    // implicit val officeNetwork = new Wifi("Office")
    val cafeteriaNetwork = new Wifi("Cafe")
    connectToNetwork("guest")(cafeteriaNetwork)
    connectToNetwork("John Doe")
  }

  def atHome(): Unit = {
    println("----home----")
    // implicit val homeNetwork = new Wifi("Home")
    connectToNetwork("Scott Tiger")
  }

  def main(args: Array[String]): Unit = {
    atOffice()
    atHome()
  }
}

