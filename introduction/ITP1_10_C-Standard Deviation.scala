object Main extends App {
  val lines = io.Source.stdin.getLines
  while(lines.next != "0") {
    val line = lines.next.split(" ").map(_.toDouble)
  }
}
