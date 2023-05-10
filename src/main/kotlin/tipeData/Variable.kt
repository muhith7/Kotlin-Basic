package tipeData
//Uppercase untuk menandakan bahwa itu constan
const val APPLICATION = "Belahar Kotlin"
const val VERSION = "0.1.0"

fun main() {
    // variabel var adalah mutable sedangkan val adalah imutable
    //var dapat di rubah isinya
    //val tidak dapat dirubah variablenya tetapi bisa dirubah isinya contoh kita bisa merubah isi array
    val firstName: String = "Abdul"
    //Kotlin Secara langsung tahu bahwa lastname adalah Stirng jadi mempersingkat
    val lastname = "Muhith"

    println(firstName)
    println(lastname)

    //Nullable
    var friendName: String? = "daqna"
    friendName = null

    // error karena friendName bisa null
    //print(friendName.length)
    // cara mengakses null yang benar
    println(friendName?.length)

    // Variable Constant merupakan Immutable data, yang bisa diaksese global (dimanapun) wajib val

    println("$APPLICATION : $VERSION")


}