using System;

public class Program {
  public static void Main() {
    var ab = Console.ReadLine().Split();
    int a = Int32.Parse(ab[0]);
    int b = Int32.Parse(ab[1]);
    if (a == b) {
      Console.WriteLine("a == b");
    } else if (a > b) {
      Console.WriteLine("a > b");
    } else {
      Console.WriteLine("a < b");
    }
  }
}
