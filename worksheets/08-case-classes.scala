case class Person(age: Int, firstName: String, lastName: String)
object Person {
  def fullName(p: Person): String = s"${p.firstName} ${p.lastName}"
}

val saul = Person(45, "Saul", "Goodman")

Person.fullName(saul)

//saul.age = 46

//val updatedSaul = saul.copy(age = 46)
//
//saul == updatedSaul
//
//val saul2 = Person(45, "Saul", "Goodman")
//
//saul == saul2