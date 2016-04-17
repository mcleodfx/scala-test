package controllers

import models._
import java.text.DecimalFormat

object Checkout extends App {
  val oranges = new Orange()
  val apples = new Apple()
  
  println(scanBEEP(args))
  
  def scanBEEP(scan: Array[String]) = {
     val formatter = new DecimalFormat("£#,###.00")
     formatter.format((oranges.price*calcPrice(scan, apples)) + (oranges.price*calcPrice(scan, oranges)))
  }
  def calcPrice(list: Array[String], produce: Produce): Float = {
    produce match {
        case Orange() => 
            if (oranges.twoForOne) {
               ((list.count(_ == "orange")/2))    
            } else if(oranges.threeForTwo) {
               ((list.count(_ == "orange")/2)*2)
            } else {
               list.count(_ == "orange")
            }             
        case Apple() => 
            if (apples.twoForOne) {
               ((list.count(_ == "apple")/2))    
            } else if(apples.threeForTwo) {
               ((list.count(_ == "apple")/2)*2)
            } else {
               list.count(_ == "apple")
            } 
        case _ => 0 
    }
  }
}

