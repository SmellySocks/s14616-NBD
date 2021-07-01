object z3 {
  val dayList = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela");
  var string = ""
  def main(args: Array[String]): Unit = {
  function(0,dayList);
    println(string)
  }
  def function(n:Int, array: List[String]): Unit ={
    string=string.concat(array(n)+",")
    if (n<array.length-1) function(n+1, array)
  }
}
