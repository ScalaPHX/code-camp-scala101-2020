trait FullName {
  def fullName: String
}

class Person(age: Int, firstName: String, lastName: String) extends FullName {
  def fullName: String = s"$firstName $lastName"
}

object Person {
  def apply(age: Int, firstName: String, lastName: String) = new Person(age, firstName, lastName)

  def printFullName(fullNamed: FullName): Unit = println(s"${fullNamed.fullName}")
}

val walter = new Person(42, "Walter", "White")

println(s"${walter.fullName}")

val jessie = Person(24, "Jessie", "Pinkman")

Person.printFullName(jessie)

val jessie2 = Person(24, "Jessie", "Pinkman")

jessie == jessie2

//walter.age = 43

