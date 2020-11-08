import java.lang.NullPointerException

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
}
