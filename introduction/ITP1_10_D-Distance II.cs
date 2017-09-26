using System;
using System.Linq;
public class Program {
  public static void Main() {
    int n = int.Parse(Console.ReadLine());
    double[] x = Console.ReadLine().Split(' ').Select(double.Parse).ToArray();
    double[] y = Console.ReadLine().Split(' ').Select(double.Parse).ToArray();
    double d, d1 = 0, d2 = 0, d3 = 0, max = 0;
    for(int i = 0; i < n; i++) {
       d = Math.Abs(x[i] - y[i]);
       d1 += d;
       d2 += d * d;
       d3 += d * d * d;
       if(max < d) max = d;
    }
    Console.WriteLine(d1+"\n"+"\n"+Math.Sqrt(d2)+"\n"+Math.Pow(d3, 1/3.0)+"\n"+max);
  }
}
