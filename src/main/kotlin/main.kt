import java.lang.NullPointerException
import kotlin.math.sin
import kotlin.math.sqrt

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

    val (x1,x2) = squareEquation(1.0,2.0,1.0,5.0)
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

fun squareEquation(a:Double,b:Double,c:Double,x:Double):Pair<Double?,Double?>{
    val delta  = b*b-4*a*c
    if(delta>=0){
        if(a==0.0)
            return Pair(null,null)

        return Pair(-b*sqrt(delta)/2/a,b*sqrt(delta)/2/a)
    }else
        return Pair(null,null)
}
