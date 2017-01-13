object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val line = sc.nextLine()

  var str: Array[Int] = line.split(" ").map(_.toInt)
  str = str.sorted

  println(str.mkString(" "))
}
