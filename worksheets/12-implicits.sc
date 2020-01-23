implicit val name = "Elliot"
val age = 24

def describe(age: Int)(implicit name: String) = s"$name is $age"

case class ApiPerson(firstName: String, lastName: String)

case class Person(age: Option[Int], firstName: String, lastName: String)
object Person {
  implicit def convertFromApi(apiPerson: ApiPerson) = Person(Option.empty, apiPerson.firstName, apiPerson.lastName)
}

def describe(person: Person) = s"${person.firstName} is ${person.age.fold("Unknown")(a => a.toString)} years old."

val elliotApi = ApiPerson("Elliot", "Alderson")
val angelaPerson = Person(Option(25), "Angela", "Moss")

describe(elliotApi)
describe(angelaPerson)