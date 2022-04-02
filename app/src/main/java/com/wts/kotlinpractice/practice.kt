package com.wts.kotlinpractice

import java.util.*

fun main(args: Array<String>)
{
    var  scanner = Scanner(System.`in`)
    println("Enter any number")
    var number = scanner.nextInt()
    if (checkPrimeNumber(number)) println("it is a prime number") else println("it is not a prime number")
}
fun checkPrimeNumber(number:Int):Boolean
{
if (number < 2) return false
    for (i in 2..number/2)
    {
        if (number%i == 0) return false

    }
    return true

}