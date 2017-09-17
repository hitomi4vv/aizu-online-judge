using System;
using System.Linq;
public class Program {
  public static void Main() {
    int n;
    while ((n = int.Parse(Console.ReadLine())) != 0) {
      double[] s = Console.ReadLine().Split(' ').Select(double.Parse).ToArray();
      double m = s.Average();
      Console.WriteLine(Math.Sqrt(s.Select(x => Math.Pow(x-m, 2)).Sum()/n));
    }
  }
}
