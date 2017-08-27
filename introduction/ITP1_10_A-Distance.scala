object Main extends App {
  val p = io.StdIn.readLine.split(" ").map(_.toDouble)
  println(Math.hypot(p(2)-p(0), p(3)-p(1)))
}
