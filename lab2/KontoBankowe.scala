class KontoBankowe (var stanKonta:Int){

  def this(){
    this(stanKonta = 0)
  }

  def wplata (kwota: Int): Unit = stanKonta+=kwota
  def wyplata (kwota: Int): Unit = stanKonta-=kwota

}


object z2 {
  def main(args: Array[String]): Unit = {
    val konto = new KontoBankowe(1000)
    println(konto.stanKonta)
    konto.wplata(1000)
    println(konto.stanKonta)
  }
}


