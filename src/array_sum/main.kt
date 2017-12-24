package array_sum

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val size = sc.nextInt()
    var sum = 0
    for (i in 1 .. size) {
//        println(i)
        sum = sum + sc.nextInt()
    }
    println(sum)
//    val num3 = sc.nextInt()
//    val sum = solveMeFirst(num1, num2, num3)
//    println(sum)
}
