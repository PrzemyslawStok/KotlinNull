import java.lang.NullPointerException
import kotlin.math.sin

fun main() {
    var name:String? = "Przemysław"
    var surname:String = "Stokłosa"

    if(true)
        name = null

    println("Długość napisu $name: ${name?.length}")

    try {
        println("Długość napisu $name: ${name!!.length}")
    }catch(e: NullPointerException){
        println("Przechwycono wyjątek: ")
        println(e.stackTraceToString())
    }

    println("Długość napisu $surname: ${surname.length}")

    var nameLength = name?.length?:-1

    val x = 0.0
    val y = equationValue(x)?:-1
    println("Wartość równania wynosi: ${y}")

    println(equation(equationValue(x)?:-1.0))
}

fun equationValue(x: Double):Double?{
    if(x!=0.0)
        return 1/x;
    else
        return null
}

fun equation(x: Double):Double{
    return sin(x)
}
