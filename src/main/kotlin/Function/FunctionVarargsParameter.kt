package Function

fun  hitungTotal(vararg values: Int): Int{
    var total = 0

    for (value in values){
        total += value
    }
    return total
}

fun main() {
    println(hitungTotal(5,5,5,5,5,5,5))

}