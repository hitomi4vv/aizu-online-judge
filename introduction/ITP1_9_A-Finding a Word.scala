object Main extends App {
  val line = io.Source.stdin.getLines.toList.init
  println(line.tail.map(_.split(" ").count(_.toLowerCase == line.head)).sum)
}
