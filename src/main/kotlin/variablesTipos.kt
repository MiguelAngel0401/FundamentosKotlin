fun main(){
    // Variable sy Tipos de Datos Kotlin
    // val para constantes
    // var para variables

    val name = " Miguel Angel"
    var age = 19

    print("Hi I'm$name and I'm ")
    println("$age years old")

    //name = "Mike" las variables val no cambian (inmutables)
    age = 20
    age += 15

    //age = "diez" Variables var cambian de valor pero no de tipo

    // Respecified Tip de Data en declaration

    //Declaration
    //Initialization
    val city: String = "Tetla de la Solidaridad"

    // Declaration e Initialization
    val isMarried:Boolean = false

    val cars:Int = 0
    val height: Double = 1.73

    println(isMarried)


    // Strings Templates
    // $ para imprimir valor de variables
    // ${} para procesos antes de imprimir
    println("Hola soy $name y tengo $age años")
    println("Vivo en $city, tengo $cars carro")

    println("En 2030 tendre ${ cars + 3 } carros 🚗")
}