package Function

fun saySaySayHello(namaDepan: String,
                namaTengah: String,
                namaBelakang: String){
    println("Hallo $namaDepan $namaTengah $namaBelakang")
}

fun main() {
    saySaySayHello("Abdul", "Muhith", "Nawawi")
    saySaySayHello(namaBelakang = "Nawawi",
    namaDepan = "Abdul",
    namaTengah = "Muhith")

}