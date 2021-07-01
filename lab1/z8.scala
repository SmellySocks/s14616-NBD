import scala.:+

object z8 {
  def main(args: Array[String]): Unit = {

    val lista=List(0,1,0,100,2,2,4,60, 0, 71)
    val nowa=lista.filter(_!=0)
    println("Przed filtrem: "+lista)
    println("Po filtrze: "+nowa);

  }

}
