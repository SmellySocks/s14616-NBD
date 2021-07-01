object z9 {
  def main(args: Array[String]): Unit = {
    val lista = List(1,2,4,7,12,33,54)
    val nowa = lista.map(add)
    println(nowa)

  }

  def add(int: Int): Int = {
    int + 1
  }

}
