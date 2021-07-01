object z1 {

  def main(args: Array[String]){

    var string = ""
    val dayList = List("Poniedzialek","Wtorek","Sroda","Czwartek","Piatek","Sobota","Niedziela");
      println("a: ");
    for( a <- dayList ){
       string = string.concat(a+ ",");
    }
    println(string);
    string = ""
    println("b: ");
    for( a <- dayList ){
      if (a.startsWith("P")){
        string = string.concat(a+ ",");
      }
    }
    println(string);
    var i = dayList.length;
    var l = 0;
    println("c: ")
    string = ""
    while (l<i){
      string = string.concat(dayList(l) + ",");
      l=l+1;
    }
    println(string);
  }
}
