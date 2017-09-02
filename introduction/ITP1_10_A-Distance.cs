using System;
using System.Linq;
using static System.Math;
public class Program {
  public static void Main() {
    double[] p = Console.ReadLine().Split().Select(double.Parse).ToArray();
    Console.WriteLine(Sqrt(Pow(p[2]-p[0],2)+Pow(p[3]-p[1],2)));
  }
}
