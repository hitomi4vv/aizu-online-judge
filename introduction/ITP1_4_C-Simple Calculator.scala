object Main {
  def main(args: Array[String]):Unit = {
    for(line <- scala.io.Source.stdin.getLines() if line.size > 0) {
      val str = line.split(" ")
      if(!str.contains("?")) {
        println(calc(str(0).toInt, str(1).toString, str(2).toInt))
      }
    }
  }
  def calc(a:Int, op:String, b:Int):Int = {
    op match {
      case "+" => a + b
      case "-" => a - b
      case "*" => a * b
      case "/" => a / b
    }
  }
}
