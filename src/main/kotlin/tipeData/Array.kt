package tipeData
//Array merupakann tipe data yang didalamnya terdapat kumpulan tipde data
//Index array selalu dimulai dari 0 jadi untuk mengitung jumlah indexs -1

fun main() {
    val names: Array<String> = arrayOf("muhith","dakna","bais")
    //names.set(0, "pajar")
    names[0] = "Rudi"
    println(names[0])

    val nilai: Array<Int> = arrayOf(1,2,3,4,5)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    // Oprator ? untuk menandakan array boleh null atau array kosong agar bisa diisi
    val members: Array<String?> = arrayOfNulls(5)
    members[0] = "abdul"
    members[1] = "daqna"
    members[2] = "verry"
    members[3] = "bais"
    members[4] = "tanos"
    println(members[0])



}