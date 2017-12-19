case class Dice(var label:Array[String]) {
  def rotate(dir:Char) =
    dir match {
      case 'N' => Array(1,5,2,3,0,4)
      case 'S' => Array(4,0,2,3,5,1)
      case 'E' => Array(3,1,0,5,4,2)
      case 'W' => Array(2,1,5,0,4,3)
    }
  def roll(dirs:String) =
    label = dirs.foldLeft(Array(0,1,2,3,4,5)) { (x,y) => rotate(y).map(x) }.map(label)
  var patterns = List[Array[String]]()
  for(i <- 0 to 7 if i != 5) {
    roll(if(i<4)"N" else "W");
    patterns :+= label
  }
  print(patterns.size)
}
object Main extends App {
  val dice = Dice(readLine.split(" "))
  val n = readInt
  (0 until n).foreach { i =>
    val l = readLine.split(" ")
    println(l.mkString(" "))
  }
}
