package compare_the_triplets

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var sum1 = 0
    var sum2 = 0

    val a1 = sc.nextInt()
    val a2 = sc.nextInt()
    val a3 = sc.nextInt()
    val b1 = sc.nextInt()
    val b2 = sc.nextInt()
    val b3 = sc.nextInt()

    if (a1 > b1) {
        sum1 = sum1 + 1
    }
    if (a2 > b2) {
           sum1 = sum1 + 1
       }
    if (a3 > b3) {
           sum1 = sum1 + 1
       }

    if (a1 < b1) {
        sum2 = sum2 + 1
    }
    if (a2 < b2) {
           sum2 = sum2 + 1
       }
    if (a3 < b3) {
           sum2 = sum2 + 1
       }

    println(sum1)
    println(sum2)
//    val num3 = sc.nextInt()
//    val sum = solveMeFirst(num1, num2, num3)
//    println(sum)
}
