object Main extends App {
  val line = io.Source.stdin.getLines.toList
  var s = line(0)
  line.drop(2).map(_.split(" ").toList).map(o => {
    val a = o(1).toInt
    val b = o(2).toInt+1
    val as = s slice(0, a)
    val bs = s slice(b, s.length)
    o(0) match {
      case "print" => println(s slice(a,b))
      case "reverse" => s = as+(s slice(a,b)).reverse+bs
      case "replace" => s = as+o(3)+bs
    }
  })
}
