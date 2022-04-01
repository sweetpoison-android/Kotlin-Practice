package com.wts.kotlinpractice

import java.util.*

fun main(args: Array<String>)
{

  untilInForLoop()
}
fun untilInForLoop()
{
  for (i in 10 until 100 step 3)
  {
    println(i)
  }

}