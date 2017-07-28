object Main extends App {
  val lines = io.Source.stdin.getLines
  for(s <- lines if s != "-") println(lines.take(lines.next.toInt).map(_.toInt).foldLeft(s)((t, h) => t.drop(h) + t.take(h)))
}
