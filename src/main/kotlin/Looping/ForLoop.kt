package Looping

fun main() {
    var names = arrayOf("abdul", "muhith", "nawawi")

    var total = 0

    for (name in names) {
        println(name)
        total++
    }
    println("Total Perulangan = $total")

    val ukuranArray = names.size - 1
    for (i in 0..ukuranArray){
        println("Index Ke $i = ${names.get(i)} ")
    }

}