object MySingleton {
    val name = "Singleton"
    fun printName() {
        println(name)
    }
}

fun main() {
    MySingleton.printName()  // Singleton
}