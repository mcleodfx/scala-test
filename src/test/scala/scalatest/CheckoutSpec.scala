package scalatest

import org.scalatest.FunSuite
import models._
import controllers._

class CheckoutSpec extends FunSuite {
    
  test("scanBEEP total should equal £2.20 because to offers are set") {
    val scan = Array[String]("orange", "orange", "apple", "orange", "apple", "orange")
    assert(Checkout.scanBEEP(scan)=="£2.20")
  }


}