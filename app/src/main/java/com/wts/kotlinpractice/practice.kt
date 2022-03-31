package com.wts.kotlinpractice

import java.util.*

fun main(args: Array<String>)
{
//  println("Hello kotlin")
  println(addNumber())
}
fun addNumber():Int
{
  var scanner = Scanner(System.`in`)
  println("Enter first number")
  val a = scanner.nextInt()
  println("Enter second number")
  val b = scanner.nextInt()
  return a+b
}