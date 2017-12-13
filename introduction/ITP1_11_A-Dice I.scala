case class Dice(var label:Array[String]) {
}
object Main extends App {
  val dice = Dice(readLine.split(" "))
//   dice.roll(readLine().toCharArray)
  println(dice)
}
