package tipeData
// Kumpulan data karakter atau simplenya teks
fun main() {
    var firstName: String  = "Abdul"
    var lastName: String = "Muhith"

    var address: String = """
        Jalan belum jadi, RT 01 RW 01,
        Kabupaten Tegal,
        Jawa tengah,
        Indonesia
    """.trimIndent()

    println(firstName)
    println(lastName)
    println(address)

    // Oprator + untuk menambahkan stringn
    var fullName: String = firstName + " " + lastName
    println(fullName)

    //String Template oprtator $ lebih recomend dari + dalam string

    var fullName2: String = "$firstName $lastName"
    println(fullName2)

    //Deskripsi
    var desc: String = "$fullName length = ${fullName.length}"
    println(desc)




}