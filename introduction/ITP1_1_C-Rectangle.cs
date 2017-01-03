using System;

public class Program {
  public static void Main() {
    var ab = Console.ReadLine().Split();
    int a = Int32.Parse(ab[0]);
    int b = Int32.Parse(ab[1]);
    Console.WriteLine(a*b + " " + (a+b)*2);
  }
}
