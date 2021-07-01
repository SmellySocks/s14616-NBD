object z6 {


  def main(args: Array[String]): Unit = {
    val mapa = ("asd",1,1.9)
    printuj(mapa)
  }
  def printuj(mapa: (String, Int, Double)): Unit ={
    println(mapa)
    //chyba, że trzeba bylo wydrukować typy, to wtedy to:
    println(mapa._1.getClass.toString+ " " + mapa._2.getClass.toString +" " + mapa._3.getClass.toString);
  }

}
