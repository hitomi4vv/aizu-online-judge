using System;
using System.Linq;
public class Program {
  public static void Main() {
    double[] p = Console.ReadLine().Split().Select(double.Parse).ToArray();
    Console.WriteLine(Math.Sqrt(Math.Pow(p[2]-p[0],2)+Math.Pow(p[3]-p[1],2)));
  }
}
