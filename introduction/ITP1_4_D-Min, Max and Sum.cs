using System;
using System.Linq;

public class Program {
  public static void Main() {
    int n = int.Parse(Console.ReadLine());
    var line = Console.ReadLine().Split();
    long[] arr = line.Select(long.Parse).Skip(0).Take(n).ToArray();
    Console.WriteLine(arr.Min() + " " + arr.Max() + " " + arr.Sum());
  }
}
