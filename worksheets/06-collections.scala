val names: Seq[String] = Seq("Walter", "Jessie", "Saul")

names(1)

names.head

names.tail

names.foreach(println)

names.find(_ == "Jessie")

val quantities = List(23, 48, 12)

quantities.sum

quantities.map(_ * 2)

names.zipWithIndex

val quantitiesWithName: Seq[(String, Int)] = names.zip(quantities)

val quantityByNameMap = quantitiesWithName.toMap

println(s"Walter's contribution: ${quantityByNameMap("Walter")}")

val ages: List[Int] = 24 :: 43 :: 54 :: Nil