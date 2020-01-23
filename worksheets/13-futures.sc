import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

// Futures cannot run in the worksheet unfortunately :(

val futureAge = Future(32)

futureAge.onComplete {
  case Success(age) => println(age)
  case Failure(ex) => ex.printStackTrace()
}

val futureName = Future("Elliot")

futureName.map("Name: " + _)

val changeName: String => String = (name) => s"Name: $name"

val futureAnotherName = Future("Angela")
futureAnotherName.map(changeName).recover {
  case ex: Exception => s"Name Unknown due to error: ${ex.getMessage}"
}

val future1 = Future(1)
val future2 = Future(2)

val results: Future[Int] = for {
  one <- future1
  two <- future2
  if (two == 2)
} yield one + two

