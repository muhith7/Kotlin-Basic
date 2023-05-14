package Function

fun retuningUnit(nama: String?): Unit{
    if (nama==null){
        println("Hello Brow")
    }else{
        println("Hello $nama")
    }
}

fun main() {
    retuningUnit("Abdul")
}