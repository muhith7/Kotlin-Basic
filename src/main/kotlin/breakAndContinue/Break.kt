package breakAndContinue

fun main() {
    var i = 0

    while (true) {
        println("Perulangan ke $i")
        i++
        if (i > 1000){
            break
        }
    }
}



test