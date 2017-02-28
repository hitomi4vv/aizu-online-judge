import scala.io.Source

object Main extends App {
  Source.stdin.getLines.toList.map(_.split(" ").map(_.toInt).toList)
    .takeWhile({case List(h, w) => h + w != 0})
    .map({case List(h, w) => {for(i <- 1 to h) yield "#" + ((if(i != 1 && i != h) "." else "#") * (w - 2)) + "#"}.mkString("\n")})
    .map(_ + "\n")
    .map(println)
}
