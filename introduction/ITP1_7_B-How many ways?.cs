using System;
using System.Linq;

public class Program {
  public static void Main() {
    string line;
    while((line = Console.ReadLine()) != "0 0") {
      int[] arr = line.Split().Select(int.Parse).ToArray();
      int n = arr[0], x = arr[1], c = 0;
      for(int i = 1; i < x/3; i++) c += Math.Max(Math.Min(n, (x-i+1)/2) - Math.Max(i+1, x-i-n), 0);
      Console.WriteLine(c);
    }
  }
}
