import scala.collection.mutable.ListBuffer

object z2 {
  var string = ""
  var string_rev = ""
  var i = 0;
  def main(args: Array[String]) {
    val dayList = ListBuffer("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela");
    function(dayList)
    string=""
    val dayList_rev = ListBuffer("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela");
    function_rev(dayList_rev)

    //Obrzydliwe, wiem, ale działa



  }
  def function_rev(r: ListBuffer[String]): Unit ={
    if (!r.isEmpty) {
      string_rev = string_rev.concat(r(r.length-1)+",")
      r-=r(r.length-1);
      function_rev(r)
    }
    else
      println(string_rev)
  }

  def function(n: ListBuffer[String]): Unit ={
    if (!n.isEmpty) {
      string = string.concat(n(0)+",")
      n-=n(0);
      function(n)
    }
    else
      println(string)
  }







}
