object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val line = sc.nextLine()

  val str = line.split(" ")
  val a = str(0).toInt
  val b = str(1).toInt
  val c = str(2).toInt

  if (a < b && b < c) {
    println("Yes")
  } else {
    println("No")
  }
}
