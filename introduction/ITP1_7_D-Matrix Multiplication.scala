object Main extends App {
  val Array(n, m, l) = readLine.split(" ").map(_.toInt)
  val a = Array.ofDim[Int](n, m)
  val b = Array.ofDim[Int](m, l)
  println(n,m,l,a,b)
}
