object z4 {
  val dayList = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela");
  def main(args: Array[String]): Unit = {
  val string_a : String = dayList.foldLeft("")((a,b) =>a+","+b)
    println("A:" + string_a)
    val string_b : String = dayList.foldRight("")((a,b) => a+","+b)
    println("B:" + string_b)
    val string_c : String = dayList.foldLeft("")((a,b) => if (a.startsWith("P")) a else b)
    println("C:" + string_c) //I dunno
  }

}
