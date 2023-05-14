package Function

infix fun String.to(type: String): String{
    if (type == "UP"){
        return this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}

fun main() {
    val result = "Abdul Muhith Nawawi" to "UP"
    println(result)

    1 downTo 0

}