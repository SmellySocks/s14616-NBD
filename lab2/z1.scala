object z1 {
  def main(args: Array[String]): Unit = {
    println(check("Sroda"))
    println(check("Sobota"))
    println(check("Jajco"))

  }
  def check(string: String): String = string match {
    case "Poniedzialek" | "Wtorek" | "Sroda" | "Czwartek" | "Piatek" => "Praca"
    case "Sobota" | "Niedziela" => "Weekend"
    case _ => "nie ma takiego dnia"
   }

}
