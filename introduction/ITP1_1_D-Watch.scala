object Main {
  def main(args:Array[String]) = {
    val sc = new java.util.Scanner(System.in)
    val time = sc.nextInt
    val hour = time / 3600;
    val minutes = (time / 60) % 60;
    val seconds = time % 60;
    println(hour + ":" + minutes + ":" + seconds)
  }
}
