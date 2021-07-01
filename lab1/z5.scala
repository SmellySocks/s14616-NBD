object z5 {
  def main(args: Array[String]): Unit = {
    val Zabka = Map(
      "Hotdog" -> 3.5,
      "Fajki" -> 16.5,
      "Cola Zero" -> 4.9
    )
    val resultMap = Zabka.map(item => (item._1,item._2*0.9)).toMap
    println(resultMap)

  }
}
