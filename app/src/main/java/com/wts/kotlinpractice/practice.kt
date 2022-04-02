package com.wts.kotlinpractice

import android.widget.Toast
import java.util.*

fun main(args: Array<String>)
{
    var count:Int = 0
    var  scanner = Scanner(System.`in`)
    println("Enter first number")
    var firstNumber = scanner.nextInt()
   println("Enter second number")
    var secondNumber = scanner.nextInt()

    while (firstNumber < secondNumber)
    {
      var primeNumber:Boolean? = checkPrimeNumber(firstNumber)
        if (primeNumber == true)
        {
            println(firstNumber.toString())
            count++
        }
        firstNumber++

    }
   // println(count.toString())
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