package com.wts.kotlinpractice

import java.util.*

fun main(args: Array<String>)
{
    var scanner = Scanner(System.`in`)
    println("Enter word")
    var word = scanner.next()

    when(word)
    {
        "sun" ->  println("The Sun is a star")
        "aryabhatt" ->  println("The Aryabhatt is a satellite")
        "Dog" ->  println("The Dog is a Animal")
        else -> println("I don't know")
    }
}