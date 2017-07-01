object Main extends App {
  val s = scala.io.Source.stdin.getLines.mkString.toLowerCase
  ('a' to 'z').foreach(c => println(c + " : " + s.count(_ == c)))
}
