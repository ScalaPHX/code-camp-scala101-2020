val maybeName = Option("Elliot Alderson")

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

val maybeAnotherName = Option("Angela Moss")

val maybeNames = for {
  elliot <- maybeName
  angela <- maybeAnotherName
} yield Seq(elliot, angela)




