using System;
using System.Linq;

public class Program {
  public static void Main() {
    while(true) {
      var line = Console.ReadLine().Split();
      int[] arr = line.Select(int.Parse).ToArray();
      if(arr.Sum() == 0) {
        break;
      }
      Array.Sort(arr);
      Console.WriteLine(string.Join(" ", arr.Select(x => x.ToString()).ToArray()));
    }
  }
}
