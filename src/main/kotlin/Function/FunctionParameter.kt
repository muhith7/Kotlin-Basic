package Function

fun sayHello(namaDepan : String, namaBelakang : String? ){
    if (namaBelakang == null){
        println("Hello $namaDepan")
    }else{
        println("Hello $namaDepan $namaBelakang")
    }
}

fun main() {
    sayHello("Aqna","Daqna")
    sayHello("Abdul", null)
    sayHello("daffa", "ganteng")

}