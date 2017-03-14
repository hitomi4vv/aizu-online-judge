import scala.io.StdIn

object Main extends App {
  StdIn.readInt()
  println(StdIn.readLine.split(" ").reverse.mkString(" "))
}
