package org.precompiler.scala101.ch04
import java.util.{ArrayList => JList}

/**
  *
  * @author Richard Li
  */
object TypeAliasing {
  def main(args: Array[String]): Unit = {
    val police = new PoliceOfficer("Scott")
    type Cop = PoliceOfficer
    val cop = new Cop("Scott")
    type Garda = PoliceOfficer
    val garda = new Garda("Scott")
    val list = new JList[PoliceOfficer]()
    list.add(police)
    list.add(cop)
    list.add(garda)
  }
}

class PoliceOfficer(val name: String)
