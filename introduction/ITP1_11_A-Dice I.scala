import scala.io.StdIn
object Main {
  def main(args: Array[String]) = {
    val dice = StdIn.readLine().split(" ").map(_.toInt)
    val chars = StdIn.readLine().toCharArray
    println(dice);
    println(chars);
  }
}
