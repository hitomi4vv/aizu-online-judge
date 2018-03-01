using System;
using System.Linq;
public class Program {
  public static void Main() {
    Console.WriteLine(Console.ReadLine().Split().OrderBy(int.Parse).Aggregate((x,y) => x+" "+y));
  }
}
