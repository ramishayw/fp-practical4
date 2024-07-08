object Q3 extends App {
    def toUpper(x: String): String = x.toUpperCase()

    def toLower(x: String): String = x.toLowerCase()

    def formatNames(name: String)(formatter: String => String): String = formatter(name) 

    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    names.foreach { name =>
        println(formatNames(name)(toUpper)) 
        println(formatNames(name)(s => s.capitalize)) 
        println(formatNames(name)(toLower)) 
        println(formatNames(name)(s => s.init + s.last.toUpper)) 
    }
}