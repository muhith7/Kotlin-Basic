package Function

fun String.hello(): String = "Hello $this"
fun String.printHello(): Unit = println("Hellow $this")


fun main() {
    val name = "Muhith"
    println(name.hello())

    name.printHello()
    "Abdul".printHello()

}