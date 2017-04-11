import scala.io.Source

object Main extends App {
  println(Source.stdin.getLines.toList.tail
    .map(_.split(" ").map(_.toInt))
    .foldLeft(Array.fill(4, 3, 10)(0)){ case (arr, Array(b, f, r, v)) => arr(b-1)(f-1)(r-1) += v; arr }
    .map(_ + "\n")
    .mkString("#" * 20 + "\n"))
}
