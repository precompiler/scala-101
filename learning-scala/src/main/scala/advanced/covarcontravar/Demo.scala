package advanced.covarcontravar

/**
  *
  * @author Richard Li
  */
object Demo {
  def main(args: Array[String]) = {
    val petStore = new PetStore()
    petStore.storePet(new Cage[Pet](new Pet()))
    petStore.storePet(new Cage[Dog](new Dog()))
    petStore.storePet(new Cage[Cat](new Cat()))
    // not allowed
    // petStore.storePet(new Cage[Tiger](new Tiger()))

    val zoo = new Zoo()
    zoo.store(new ZooCage[Tiger](new Tiger()))
    zoo.store(new ZooCage[DangerousAnimal](new DangerousAnimal()))
    zoo.store(new ZooCage[Animal](new Animal()))

    // not allowed
    // zoo.store(new ZooCage[Pet](new Pet()))
  }
}


class PetStore {
  def storePet(cage: Cage[Pet]) = {
    println(s"${cage.toString} stored")
  }
}

class Zoo {
  def store(zooCage: ZooCage[Tiger]) = {
    println(s"${zooCage.toString} caged")
  }
}


class Animal {
  override def toString(): String = {
    "An animal"
  }
}

class DangerousAnimal extends Animal {
  override def toString(): String = {
    "A Dangerous animal"
  }
}

class Pet extends Animal {
  override def toString(): String = {
    "A pet"
  }
}

class Dog extends Pet {
  override def toString(): String = {
    "A puppy"
  }
}

class Cat extends Pet {
  override def toString(): String = {
    "A kitten"
  }
}

class Tiger extends DangerousAnimal {
  override def toString(): String = {
    "A tiger"
  }
}


class Cage[+T](animal: T) {
  override def toString: String = {
    animal.toString
  }
}

class ZooCage[-T](animal: T) {
  override def toString: String = {
    animal.toString
  }
}
