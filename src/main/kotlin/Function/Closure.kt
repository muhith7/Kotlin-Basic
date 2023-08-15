package Function

//  Closure merupakan kemampuan function,lamda atau anonymouse function yang bisa berintraksi dengan data data disekitar scope
//  yang sama
//!! Gunaka fitur ini dengan bijak karena bisa saja kita tidak sengaja merubah niali suatu variable



fun main() {
    var counter: Int = 0
    //var name: String = "Muhith"

    val lamdaIncrement:() -> Unit = {  //Contoh Lamda
        println("Lamda increment")
        counter++
       // name = "Abdul" -- misal kita lupa ingin membuat variable name baru tapi lupa mendeklarasikannya secara tidak sengaja kita merubah dnilai name diatas
    }

    val anonymousIncrement = fun() {  //Contoh Anonymouse
        println("Anonymouse Function Increment")
        counter++
    }

    fun functionIncrement(){
        println("Function incremnent")
        counter++
    }

    lamdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lamdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)
   // println(name)

}