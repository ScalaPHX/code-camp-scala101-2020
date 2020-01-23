val name = "Elliot"

name match {
  case "Dom" => println("FBI Agent")
  case "Elliot" => println("1337 h4x0r")
  case "Angela" => println("Corporate Exec")
}

case class Person(age: Int, firstName: String, lastName: String)

val elliot = Person(24, "Elliot", "Alderson")
val angela = Person(25, "Angela", "Moss")
val dom = Person(35, "Dom", "DiPierro")

def describe(person: Person): Unit = {
  person match {
    case Person(_, firstName, lastName) if (firstName == "Elliot") => println(s"$firstName is the narrator - can you trust him?")
    case Person(age, _, _) if (age < 30) => println("A young activist.")
    case p: Person => println(s"We have: ${p.firstName} here.")
  }
}

describe(elliot)
describe(angela)
describe(dom)

def listMatch(names: List[String]): Unit = {
  names match {
    case head :: tail =>
      println(s"$head - $tail")
      listMatch(tail)
    case Nil => println("We are done.")
  }
}


val theGang = List("Elliot", "Angela", "Dom", "Mr Robot")

listMatch(theGang)