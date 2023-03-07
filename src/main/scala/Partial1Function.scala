object Partial1Function {
  def main(args:Array[String]): Unit = {
    val abill = getBill(20,100,400)
    println(abill)

    val actbill = calcuateBill(500)
    println(s"===>$actbill")
  }

  def calcuateBill = getBill(20, 100, _: Double); //partial function

  def getBill(vatPercentage: Int, serviceTax: Int, netBill: Double): Double = {
    return netBill* (vatPercentage / 100) + serviceTax + netBill;
  }

}
