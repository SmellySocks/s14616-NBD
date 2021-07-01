class Osoba (val Imie: String, val Nazwisko: String){

}
object z3 {
  def main(args: Array[String]): Unit = {
  val majkel = new Osoba("Michal", "Hyla")
    val nowak = new Osoba("Jan", "Nowak")
    val random = new Osoba("Pan","Tadeusz")
    println(przywitanie(majkel))
    println(przywitanie(random))
    println(przywitanie(nowak))
  }

  def przywitanie(osoba: Osoba): String = (osoba.Imie, osoba.Nazwisko) match {
    case ("Michal", "Hyla") =>"siemson Hylson"
      case("Jan", "Nowak") => "dzień dobry panie nowak"
    case _ => "eluwina"

  }
}