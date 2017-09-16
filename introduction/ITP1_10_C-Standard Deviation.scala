object Main extends App {
  val lines = io.Source.stdin.getLines
  var n = lines.next.toInt
  while(n != 0) {
    val s = lines.next.split(" ").map(_.toDouble)
    val m = s.sum / n
    println(Math.sqrt(s.foldLeft(0d)((x,y)=>x+(y-m)*(y-m))/n))
    n = lines.next.toInt
  }
}
