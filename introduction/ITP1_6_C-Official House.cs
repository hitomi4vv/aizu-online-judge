using System;
using System.Linq;

public class Program {
  public static void Main() {
    int n = int.Parse(Console.ReadLine());
    int [,,] arr = new int[4, 3, 10];
    for(int i = 0; i < n; i++) {
      int[] line = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
      arr[line[0]-1, line[1]-1, line[2]-1] += line[3];
    }
    for(int b = 0; b < 4; b++) {
      if(b > 0) Console.WriteLine("####################");
      for(int f = 0; f < 3; f++) {
        for(int r = 0; r < 10; r++) Console.Write(" " + arr[b, f, r]);
        Console.WriteLine();
      }
    }
  }
}
