package com.wts.kotlinpractice

import java.util.*

fun main(args: Array<String>)
{

  forLoopFromStep()
}
fun forLoopFromStep()
{
  for (i in 10..100 step 3)
  {
    println(i)
  }

}