import java.math.BigInteger
import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    var inputNumber:Long? = null

    while ((inputNumber ?: 0) < 1) {
        print("Input maximum integer: ")
        inputNumber = input.nextLong()
    }

    for (i in 1.. (inputNumber ?: 0)) {
        println("Current Number is : $i and the cube is ${(i.toDouble().pow(3.0)).toLong()}")
    }
}