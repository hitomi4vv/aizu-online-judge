using System;

public class Program {
  public static void Main() {
    var line = Console.ReadLine().Split();

    int a = int.Parse(line[0]);
    int b = int.Parse(line[1]);

    Console.WriteLine(a/b + " " + a%b + " " + (decimal)a/b);
  }
}
