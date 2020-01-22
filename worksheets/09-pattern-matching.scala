val name = "Gus"

name match {
  case "Jessie" => println("No so scary")
  case "Walter" => println("The one who knocks.")
  case "Gus" => println("Run!")
}

//case class Person(age: Int, firstName: String, lastName: String)
//
//val walter = Person(42, "Walter", "White")
//val jessie = Person(24, "Jessie", "Pinkman")
//val saul = Person(45, "Saul", "Goodman")
//
//def describe(person: Person): Unit = {
//  person match {
//    case Person(_, firstName, lastName) if (firstName == "Walter") => println(s"$firstName is the one who knocks!")
//    case Person(age, _, _) if (age < 30) => println("Nothing to worry about here")
//    case p: Person => println(s"We have: ${p.firstName} here.")
//  }
//}
//
//describe(walter)
//describe(jessie)
//describe(saul)

//def listMatch(names: List[String]): Unit = {
//  names match {
//    case head :: tail =>
//      println(s"$head - $tail")
//      listMatch(tail)
//    case Nil => println("We are done.")
//  }
//}
//
//
//val theGang = List("Walter", "Jessie", "Saul", "Gus")
//
//listMatch(theGang)