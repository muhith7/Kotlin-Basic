package Function

fun saySayHello(namaDepan: String, namaTengah: String? = null, namaBelakang: String = ""){
    if (namaTengah == null){
        println("Hello $namaDepan")
    }else if (namaBelakang == ""){
        println("Hello $namaDepan $namaTengah")
    }else{
        println("Hello $namaDepan $namaTengah $namaBelakang")
    }
}

fun main() {
    saySayHello("Abdul")
    saySayHello("Abdul", "Muhith")
    saySayHello("Abdul","Muhith", "Nawawi")
}