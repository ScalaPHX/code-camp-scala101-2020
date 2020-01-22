implicit val name = "Gus"
val age = 55

def describe(age: Int)(implicit name: String) = s"$name is $age"

case class ApiPerson(firstName: String, lastName: String)

case class Person(age: Option[Int], firstName: String, lastName: String)
object Person {
  implicit def convertFromApi(apiPerson: ApiPerson) = Person(Option.empty, apiPerson.firstName, apiPerson.lastName)
}

def describe(person: Person) = s"${person.firstName} is ${person.age.fold("Unknown")(a => a.toString)} years old."

val gusApi = ApiPerson("Gustavo", "Fring")
val walterPerson = Person(Option(42), "Walter", "White")

describe(gusApi)
describe(walterPerson)