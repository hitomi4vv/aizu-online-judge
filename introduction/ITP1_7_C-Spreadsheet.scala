object Main extends App {
  io.Source.stdin.getLines.toList.tail
    .map(_.split(" ").map(_.toInt).toList)
    .map(r => r.mkString(" ") + " " + r.sum)
    .map(println)
}
