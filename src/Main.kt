import java.lang.Exception
import java.util.*

val scanner = Scanner(System.`in`) //importar libreria Scanner
fun main(){
    repetir()
}

fun comprobar(pedirCabtidad: Int){
        val miligramos = pedirCabtidad
        if (miligramos > 100) {
            separador("“¡Felicidades, es una buena poción multijugos!")
        } else {
            separador("“La poción es mediocre, sangre sucia inmunda")
        }
}
fun separador(texto: String){
    println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-")
    println("----------------------$texto------------------------")
}

fun letretoHogwarts(nombreProfesor: String){
    for(i in 0..1){
        separador("                                      ")
    }
    println("_-_-_-_-_-_-_-_-_-_-_-Colegio Hogwarts de Magia y Hechicería__-_-_-_-_-_-_-_-_-_-_-")
    println("Profesor encargado: $nombreProfesor \n \n")
}
fun repetir(){
    try {

        do {
            letretoHogwarts("Ricardo Rodriguez")
            print("Teclea la cantidad en miligramos para una poción multijugos: ")
            val cantidad = scanner.nextInt() //lee el numero y lo convierte en INT
            comprobar(cantidad)

            println("¿Deseas repetir? teclea 'SI'")
            val respuesta = readLine()//lee el numero y lo convierte en INT

        } while (respuesta == "SI" || respuesta == "Si" || respuesta == "si")

    }catch (e: Exception){
        println("Sangre sucia, tenías que escribir numeros enteros")
    }
}