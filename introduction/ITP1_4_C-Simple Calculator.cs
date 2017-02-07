using System;

public class Program {
  public static void Main() {
    while(true) {
      var line = Console.ReadLine().Split();
      int a = int.Parse(line[0]);
      string op = line[1];
      int b = int.Parse(line[2]);
      switch(op) {
        case "?":
          return;
        case "+":
          Console.WriteLine(a+b);
          break;
        case "-":
          Console.WriteLine(a-b);
          break;
        case "*":
          Console.WriteLine(a*b);
          break;
        case "/":
          Console.WriteLine(a/b);
          break;
      }
    }
  }
}
