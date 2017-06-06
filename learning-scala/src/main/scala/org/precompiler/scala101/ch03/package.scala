package org.precompiler.scala101.ch03

import org.precompiler.scala101.ch03.society.professional.Executive

/**
  *
  * @author Richard Li
  */
package society {
  package professional {

    class Executive {
      private[professional] var workDetails = "workDetails"
      private[society] var friends = "friends"
      //instance method can access this field only on implicit instances(this instance)
      private[this] var secrets = "secret"
      private var secrets2 = "secret2"

      def help(another: Executive): Unit = {
        println(another.workDetails)
        println(secrets)
        println(secrets2)
        //Compile error
        //println(another.secrets)
        println(another.secrets2)
      }
    }

    class Assistant {
      def assist(executive: Executive): Unit = {
        println(executive.workDetails)
        println(executive.friends)
      }
    }

  }

  package social {

    class Acquaintance {
      def socialize(person: professional.Executive): Unit = {
        println(person.friends)
        //Compile error
        //println(person.workDetails)
      }
    }

  }

}

object PackageDemo {
  def main(args: Array[String]): Unit = {

    val e1 = new Executive
    val e2 = new Executive
    e1.help(e2)

  }
}