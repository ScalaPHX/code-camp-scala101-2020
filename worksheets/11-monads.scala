val maybeName = Option("Saul Goodman")

maybeName.isDefined
maybeName.isEmpty

// BAD
if (maybeName.isDefined)
  println(s"Name: ${maybeName.get}")
else
  println("No person!")

maybeName.getOrElse("No name!")

val maybeUpdatedName = maybeName.map(name => Option(s"Name: $name"))

maybeUpdatedName.flatten.getOrElse("No Name!")

val maybeAnotherName = Option("Gus Fring")

val maybeNames = for {
  saul <- maybeName
  gus <- maybeAnotherName
} yield Seq(saul, gus)




