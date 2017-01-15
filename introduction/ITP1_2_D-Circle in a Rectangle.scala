object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val line = sc.nextLine().split(" ")

  val w = line(0).toInt
  val h = line(1).toInt
  val x = line(2).toInt
  val y = line(3).toInt
  val r = line(4).toInt

  if (r <= x && x <= w - r && r <= y && y <= h - r) {
    println("Yes")
  } else {
    println("No")
  }
}
