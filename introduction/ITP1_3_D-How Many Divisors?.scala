object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b, c = sc.nextInt
  println((a to b).filter(c % _ == 0).size)
}
