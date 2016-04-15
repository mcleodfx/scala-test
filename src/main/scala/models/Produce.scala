package models

trait Produce
case class Orange(
  val twoFourOne: Boolean = false,
  val threeFourTwo: Boolean = false, 
  val price: Double = 0.00) extends Produce

case class Apple(
  val twoFourOne: Boolean = false,
  val threeFourTwo: Boolean = false, 
  val price: Double = 0.00) extends Produce
