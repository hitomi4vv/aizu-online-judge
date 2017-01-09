using System;

public class Program {
  public static void Main() {
    var abc = Console.ReadLine().Split();

    int a = Int32.Parse(abc[0]);
    int b = Int32.Parse(abc[1]);
    int c = Int32.Parse(abc[2]);

    if (a < b && b < c) {
      Console.WriteLine("Yes");
    } else {
      Console.WriteLine("No");
    }
  }
}
