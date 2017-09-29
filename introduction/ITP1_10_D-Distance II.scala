object Main extends App {
  val Seq(_, x, y) = io.Source.stdin.getLines.map(_.split(" ").map(_.toInt)).toSeq
  val v = (x zip y).map(p => math.abs(p._1-p._2))
  def f(n: Int) = math.pow(v.map(math.pow(_, n)).sum, 1.0/n)
  (1 to 3).foreach(n => println(f(n)))
  println(v.max)
}
