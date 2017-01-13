import scala.io.StdIn

object Main {
  def main(args: Array[String]):Unit = {
    val x:Int = StdIn.readLine().toInt;
    println(Math.pow(x, 3).toInt)
  }
}
