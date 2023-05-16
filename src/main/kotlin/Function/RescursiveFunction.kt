package Function

fun main() {

    fun factorialLoop(nilai: Int): Int{
        var result = 1
        for (i in nilai downTo 1){
            result *= i
        }
        return result
    }

    println(factorialLoop(10))

    fun factorialRecursive(nilai: Int): Int{
        return when(nilai){
            1->1
            else ->  nilai * factorialRecursive(nilai - 1)
        }
    }
    println(factorialRecursive(10))
}