object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b = sc.nextInt
  println("%d %d %f".format(a/b, a%b, a.toDouble/b))
}
