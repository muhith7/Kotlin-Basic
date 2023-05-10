package expression

fun main() {
    val nilai = 'E'
    val nilaiLulus = arrayOf('A', 'B', 'C')
    val name = "Abdul"
    when (nilai) {
        'A' -> {
            println("Good Job")
        }
        'B' -> {
            println("Nice Job")
        }
        'C' -> {
            println("wtf")
        }
        else -> {
            println("Nice Try next Week")
        }
    }
    when(nilai){
        'A', 'B', 'C' -> {
            println("Selamat Anda Lulus")
        }
        else -> {
            println("Maaf anda tidak lulus")
        }
    }

    when (nilai) {
        in nilaiLulus -> println("Anda Lulus")
        !in nilaiLulus -> println("Anda Tidak Lulus")
    }

    when (name) {
        is String -> println("this is string")
        !is String -> println("isnt String ")
    }

    val nilaiUjian = 80
    when{
        nilaiUjian > 90 -> println("Very Nice Job")
        nilaiUjian > 80 -> println("Nice Job brow")
        nilaiUjian > 70 -> println("Good Job brow")
        nilaiUjian > 60 -> println("Not Bad brow")
        else -> println("Nice Try Again")
    }


}