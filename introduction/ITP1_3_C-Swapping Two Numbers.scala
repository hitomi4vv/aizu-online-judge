import scala.io.Source

object Main extends App {
  Source.stdin.getLines.toList.init.map(_.split(" ").toList.map(_.toInt).sorted.mkString(" ")).map(println)
}
