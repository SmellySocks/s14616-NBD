object z7 {
  def main(args: Array[String]): Unit = {
    val Zabka = Map(
      "Hotdog" -> 3.5,
      "Fajki" -> 16.5,
      "Cola Zero" -> 4.9
    )

    println("Camele niebieskie w miekkiej paczce: " + show(Zabka.get("Fajki")))
  }
  def show(x: Option[Double]) = x match {
    case Some(s) => s
    case None => "nima"
  }

}
