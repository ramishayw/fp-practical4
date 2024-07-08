import scala.io.StdIn._

object Q2 extends App {
    def patternMatching(x: Int):Unit = x match {
        case x if x % 2 == 0 => println("Even number")
        case x if x <= 0 => println("Negative/Zero")
        case _ => println("Odd number")
    }

    print("Enter Number: ") 
    val age = readInt()
    patternMatching(age)
}