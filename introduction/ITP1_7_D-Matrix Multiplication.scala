import scala.collection.mutable.ArrayBuffer
object Main extends App {
  val Array(n, m, l) = readLine.split(" ").map(_.toInt)
  val matrix = (ii: Int) => {
    val arr = ArrayBuffer.empty[Array[Int]]
    for(i <- 0 until ii) arr += readLine.split(" ").map(_.toInt)
    arr.toArray
  }
  val a = matrix(n)
  val b = matrix(m)
  val c = for(i <- 0 until n) yield for(j <- 0 until l)
    yield (0 until m).foldLeft(0L) {(sum,k) => sum + a(i)(k) * b(k)(j)}
  c.foreach(row => println(row.mkString(" ")))
}
