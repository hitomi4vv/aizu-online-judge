using System;
using System.Linq;
using System.Collections.Generic;
public class Program {
  public static void Main() {
    var line = Console.ReadLine();
    int c = int.Parse(line.Split()[1]);
    int[] sum = new int[c];
    while((line = Console.ReadLine()) != null) {
      int[] arr = line.Split().Select(int.Parse).ToArray();
      Console.WriteLine(line + " " + arr.Sum());
      for(int i = 0; i < c; i++) sum[i] += arr[i];
    }
    Console.WriteLine(string.Join(" ", sum.Select(v => v.ToString()).ToArray()) + " " + sum.Sum());
  }
}
