package controllers

import models._
import java.text.DecimalFormat

object Checkout {
  val oranges = Orange(true, false, 0.25)
  val apples = Apple(false, false, 0.60)
  
  def main(args: Array[String]): Unit = {       
    println(scanBEEP(args))
  }
  
  def scanBEEP(scan: Array[String]) = {
     val formatter = new DecimalFormat("£#,###.00")
     formatter.format((apples.price*calc(scan, apples)) + (oranges.price*calc(scan, oranges)))
  }
  def calc(list: Array[String], produce: Produce): Float = {
    produce match {
        case Orange(oranges.twoFourOne, oranges.threeFourTwo, oranges.price) => 
            if (oranges.twoFourOne) {
               ((list.count(_ == "orange")/2))    
            } else if(oranges.threeFourTwo) {
               ((list.count(_ == "orange")/2)*2)
            } else {
               list.count(_ == "orange")
            }             

        case Apple(apples.twoFourOne, apples.threeFourTwo, apples.price) => 
            if (apples.twoFourOne) {
               ((list.count(_ == "apple")/2))    
            } else if(apples.threeFourTwo) {
               ((list.count(_ == "apple")/2)*2)
            } else {
               list.count(_ == "apple")
            } 
        case _ => 0 
        
    }
   
  }
}

