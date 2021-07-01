import z4.{dodaj, function}

object z4 {
  def dodaj(x: Int): Int = {
    x + x
  }

  def function(number: Int, funkcja: (Int) => Int): Int = {
    funkcja(funkcja(funkcja(number)))
  }


  def main(args: Array[String]): Unit = {
    val value = 3
    println("wprowadzono: " + value + "\nwynik: " + function(value, dodaj))

  }
}
