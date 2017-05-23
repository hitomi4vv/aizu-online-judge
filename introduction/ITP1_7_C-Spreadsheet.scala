object Main extends App {
  println(io.Source.stdin.getLines.toList.tail
    .map(_.split(" ").map(_.toInt))
    .map(r => {val s = r :+ r.sum; println(s.mkString(" ")); s})
    .transpose.map(_.sum).mkString(" "))
}
