package Function

fun main() {
    fun hello(nama:String , transformer: (String) -> String): String{
        val nameTrasnform = transformer(nama)
        return "Hello $nameTrasnform"
    }

    val upper = fun(value: String): String { // Anonymouse Function digunakan untuk selain Lamda
        if (value == ""){
            return "UPS"
        }else{
            return value.toUpperCase()
        }
    }

    println(hello("Abdul", upper))
    println(hello("", upper ))

    //Atau bisa juga dumasukan kdealam parameter
    println(hello("Muhith", fun(value: String): String{
        return value.toLowerCase()
    }))
}