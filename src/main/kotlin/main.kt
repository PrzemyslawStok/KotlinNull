import java.lang.Math.random
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

    val x1 = squareEquation(1.0,2.0,1.0,5.0)

    val (a,b) = twoValuesEquation()
    println("a = $a, b = $b")

    for(i in 1..100) {
        name = generateName("${(random()*10).toInt()}")

        name?.let {
            println("Imię: ${it}")
        }.also{
            //println("Imię: ${it}")
        }
    }
}

fun generateName(str: String):String?{
    if(System.currentTimeMillis()%2!=0L)
        return "Przemysław_$str"
    else
        return null
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

fun squareEquation(a:Double,b:Double,c:Double,x:Double):Double?{
    val delta  = b*b-4*a*c
    if(delta>=0){
        if(a==0.0)
            return null

        return -b*sqrt(delta)/2/a
    }else
        return null
}

fun twoValuesEquation():Pair<Double,Double>{
    return Pair(1.0,5.0)
}
