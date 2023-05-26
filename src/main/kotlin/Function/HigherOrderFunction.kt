package Function

fun main() {
    fun hello(nama:String , transformer: (String) -> String): String{
        val nameTrasnform = transformer(nama)
        return "Hello $nameTrasnform"
    }

    val lambdaUpper = { nilai:String -> nilai.toUpperCase()}
    println(hello("Muhith", lambdaUpper))

    println(hello("Abdul", {nilai:String -> nilai.toLowerCase()}))


    //Trailing lamda dimana value parameter lamda ada diluar value parameter pertama
    //Trailing lmada bisa dilakukan jika lamda diurutan parameter paling belakang / akhir

    val result = hello("Muhith trail"){
            nilai:String -> nilai.toUpperCase()
    }

    val result2 = hello("Tidak Trail", {nilai:String -> nilai.toLowerCase()})

    println(result)
    println(result2)
}

