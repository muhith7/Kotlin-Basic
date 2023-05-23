package Function

fun main() {
    tailrec fun display(nilai : Int){
        println("Recursive ke $nilai")
        if (nilai > 0){
            display(nilai-1)
        }
    }

    tailrec fun factorialRecursive(nilai: Int, total : Int = 1): Int{
        return when(nilai){
            1->total
            else -> factorialRecursive(nilai-1,total*nilai)
        }
    }

    println(factorialRecursive(10))


}