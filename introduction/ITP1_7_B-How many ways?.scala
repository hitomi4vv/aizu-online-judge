import scala.math.{max, min}

object Main extends App {
  io.Source.stdin.getLines.toList.init
    .map(_.split(" ").map(_.toInt).toList)
    .map({case List(n, x) => (1 to x/3).foldLeft(0) {(sum, i) => sum + max(min(n, (x-i+1)/2) - max(i+1, x-i-n), 0) }})
    .map(println)
}
