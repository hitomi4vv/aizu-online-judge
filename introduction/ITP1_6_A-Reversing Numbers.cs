using System;
using System.Linq;

public class Program {
  public static void Main() {
    Console.ReadLine();
    Console.WriteLine(string.Join(" ", Console.ReadLine().Split(' ').Reverse().ToArray()));
  }
}
