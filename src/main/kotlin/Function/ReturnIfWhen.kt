package Function

fun main() {
    fun sayHelloHello(name: String = ""): String{
        return when(name){
            ""->"Hello Brow"
            else->"Hello $name"
        }
//        return if (name == ""){
//             "Hello Brow"
//        }else{
//             "Hello $name"
//        }
    }

    println(sayHelloHello())
    println(sayHelloHello("Muhith"))
}