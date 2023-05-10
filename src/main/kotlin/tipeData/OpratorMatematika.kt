package tipeData

fun main() {
    val result = 10.0 / 3.0   // .0 agar hasil tidak dibulatkan atau hasilnya akan murni dan berbubah otomatis menjadi double
    println(result)

    val result2 = 10 + 10 / 2 // Kotlin menggunakan matematika sintifik dimana pembagian akan dikerjakan terlebih dahulu
    println(result2)

    var total: Int = 0

    val barang1 = 100
    total += barang1

    val barang2 = 200
    total += barang2

    val barang3 = 300
    total += barang3

    println(total)

    total++ // total = total + 1
    total++ // total = total + 1
    total++ // total = total + 1

    println(total)

    total-- // total = total - 1
    total-- // total = total - 1
    total-- // total = total - 1

    println(total)

    val suhu = -5 // - untukb ilanga negative
    println(suhu)

    val sehat = true
    println(!sehat) // ! adalah kebalikan bolean






}