package Function

fun tambah(a: Int, b: Int): Int{
    val total = a + b
    return total
}

fun bagi(a: Int, b: Int): Int {
    if (b==0){
        return 0
    }else{
        val total = a / b
        return total
    }


}
fun main() {
    println( tambah(3,5))

    val hasil = tambah(4,6)
    println(hasil)

    val hasil2 = tambah(7,8)
    println(hasil2)

    println(bagi(10,0))

}