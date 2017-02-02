import scala.io.StdIn

object Main {
  def main(args: Array[String]):Unit = {
    val r:Double = StdIn.readLine().toDouble;
    println("%f %f".format(r*r*Math.PI, 2*Math.PI*r))
  }
}
