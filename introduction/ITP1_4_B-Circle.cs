using System;

public class Program {
  public static void Main() {
    double r = double.Parse(Console.ReadLine());
    Console.WriteLine(r*r*Math.PI + " " + 2*Math.PI*r);
  }
}
