package com.wts.kotlinpractice

import java.util.*

fun main(args: Array<String>)
{

  oddOrEvenNumber()
}
fun oddOrEvenNumber()
{
  for (i in 10..100)
  {
   if (i%2 == 0)
   {
     println("It is Even Number $i")
   }
    else
   {
     println("it is odd number $i")
   }
  }

}