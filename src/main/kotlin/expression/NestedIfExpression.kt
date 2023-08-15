package expression

fun main() {
    val nilai = 22

    if (nilai > 1 ){
        println("Nilai lebih dari satu")
        if (nilai % 2 == 0 ){
            println("Nilai ganjil")
        }else{
            println("Nilai genap")
        }
    }else if (nilai < 1){
        println("Nilai kurang dari satu")
    }else{
        println("Nilai sama denan perbandingan")
    }

}