package Function

fun toUpper(nilai: String): String = nilai.toUpperCase()
fun main() {
    //Tanpa fun LamdaExspression
    val contohLamda: (String, String) -> String = {firstName: String, lastName: String ->
        val result = "$firstName, $lastName"
        result
    } //LAmda titdak memerlukan return nilai karena baris terakhir sudah menge,balikan nilai

    val result = contohLamda("Abdul", "Muhith")
    println(result)

    val SayHello: (String) -> String = {
        "Hello $it"
    }//Ketika dalam lamda hanya memiliki satu parameter maka bisa disebut saja dengan "it"


    println(SayHello("Eko"))

    val lamdaUpper:  (String) -> String = ::toUpper
    //Mthod reference dimana kita usdah memililki satu function ( toUpper )

    println(lamdaUpper("Abdul Muhith"))






}