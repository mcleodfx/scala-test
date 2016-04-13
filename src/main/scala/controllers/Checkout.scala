package controllers

import models._
import java.text.DecimalFormat

object Checkout {
  val oranges = Produce("orange",false,false,0.25)    
  val apples = Produce("apple",false,false,0.60)
  def main(args: Array[String]): Unit = {    
    println(scanBEEP(args).toString().format(args))
  }
  def scanBEEP(scan: Array[String]) = {
     val formatter = new DecimalFormat("£#,###.00")
     formatter.format((apples.price*calc(scan, apples)) + (oranges.price*calc(scan, oranges)))
  }
  def calc(list: Array[String], produce: Produce): Float = {
    if (produce.twoFourOne) {
       ((list.count(_ == produce.prodType)/2))    
    } else if(produce.threeFourTwo) {
       ((list.count(_ == produce.prodType)/2)*2)
    } else {
       list.count(_ == produce.prodType)
    }    
  }
}

