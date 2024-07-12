object Q3 extends App {
    def toUpper(x: String): String = x.map(c => if (c >= 'a' && c <= 'z') (c - 32).toChar else c)

    def toLower(x: String): String = x.map(c => if (c >= 'A' && c <= 'Z') (c + 32).toChar else c)

    def formatNames(name: String)(format: String => String): String = format(name) 

    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    names.foreach { name =>
        println(formatNames(name)(toUpper)) 
        println(formatNames(name)(x => x.capitalize)) 
        println(formatNames(name)(toLower)) 
        println(formatNames(name)(x => x.init + x.last.toUpper)) 
    }
}
