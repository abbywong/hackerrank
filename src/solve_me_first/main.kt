package solve_me_first

import java.util.*

fun solveMeFirst(a: Double, b: Int, c: Int): Double {
    return a + b + c
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val num1 = sc.nextDouble()
    val num2 = sc.nextInt()
    val num3 = sc.nextInt()
    val sum = solveMeFirst(num1, num2, num3)
    println(sum)
}
