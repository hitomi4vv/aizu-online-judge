object Main extends App {
  scala.io.Source.stdin.getLines.toList.takeWhile(_!="0").map(_.split("").map(_.toInt).sum).map(println)
}
