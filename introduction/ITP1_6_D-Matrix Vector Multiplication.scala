object Main extends App {
    val n::m = io.Source.stdin.getLines.map(_.split(" ").map(_.toInt)).toList
    val a = m.take(n(0))
    val b = m.drop(n(0)).flatten
    a.foreach(n => println(n.zip(b).map(v => v._1 * v._2).sum))
}
