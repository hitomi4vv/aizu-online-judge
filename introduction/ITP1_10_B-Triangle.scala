import math._
object Main extends App {
  var Array(a, b, c) = io.StdIn.readLine.split(" ").map(_.toDouble)
  c *= Pi/180
  var h = b*sin(c)
  println(a*h*.5)
  println(a+b+sqrt(a*a+b*b-2*a*b*cos(c)))
  println(h)
}
