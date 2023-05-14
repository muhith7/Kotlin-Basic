package breakAndContinue

fun main() {
    for (i in 0..1000){
        if(i % 2 == 0){
            continue
        }
        println("angka $i")
    }
}