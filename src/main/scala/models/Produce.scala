package models

/*trait Produce
case class Orange(
  val twoFourOne: Boolean = false,
  val threeFourTwo: Boolean = false, 
  val price: Double = 0.00) extends Produce

case class Apple(
  val twoFourOne: Boolean = false,
  val threeFourTwo: Boolean = false, 
  val price: Double = 0.00) extends Produce
*/
  
/*class Produce {
  def typeProd = "fruit"
  def twoFourOne: Boolean = false
  def threeFourTwo: Boolean = false 
  def price: Double = 0.00
}*/
/*case class Orange extends Produce {
  override def typeProd = "orange"
  def twoFourOne: Boolean = false
  def threeFourTwo: Boolean = false 
  def price: Double = 0.00
}
case class Apple extends Produce {
  override def typeProd = "apple"
  def twoFourOne: Boolean = false
  def threeFourTwo: Boolean = false 
  def price: Double = 0.00
}*/

/*class Orange(override val prodType: String = "orange", 
  override val twoFourOne: Boolean = false,
  override val threeFourTwo: Boolean = false, 
  override val price: Double = 0.00) extends Produce {
}

class Apple(override val prodType: String = "orange", 
  override val twoFourOne: Boolean = false,
  override val threeFourTwo: Boolean = false, 
  override val price: Double = 0.00) extends Produce {
}*/

class Produce (
 pt: String = "default",
   tfo: Boolean = false,
   tft: Boolean = false ,
   p: Double = 0.00
) {
  def prodType = pt
  def twoForOne = tfo
  def threeForTwo = tft
  def price = p
}

case class Orange() extends Produce("orange", false, false, 0.25)
case class Apple() extends Produce("apple", false, false, 0.60)