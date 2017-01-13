using System;
using System.Linq;

public class Program {
  public static void Main() {
    var line = Console.ReadLine().Split();

    int[] arr = line.Select(int.Parse).ToArray();
    Array.Sort(arr);

    Console.WriteLine(string.Join(" ", arr.Select(x => x.ToString()).ToArray()));
  }
}
