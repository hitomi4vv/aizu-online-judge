using System;
using System.Linq;
public class Program {
  public static void Main() {
    double[] arr = Console.ReadLine().Split().Select(double.Parse).ToArray();
    var a = arr[0];
    var b = arr[1];
    var c = arr[2]*Math.PI/180;
    var h = b*Math.Sin(c);
    Console.WriteLine("{0}\n{1}\n{2}", a*h*.5, a+b+Math.Sqrt(a*a+b*b-2*a*b*Math.Cos(c)), h);
  }
}
