import scala.io.Source

object Main extends App {
  ("SHCD".flatMap(suit => (1 to 13).map(suit + " " + _)) diff Source.stdin.getLines.toList.tail).map(println)
}
