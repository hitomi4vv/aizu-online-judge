object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt()
  val arr = List.fill(n)(sc.nextLong())
  println((arr.min :: arr.max :: arr.sum :: Nil).mkString(" "))
}
