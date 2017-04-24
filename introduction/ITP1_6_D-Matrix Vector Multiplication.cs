using System;
using System.Collections.Generic;

public class Program {
  public static void Main() {
    var line = Console.ReadLine().Split();
    int n = int.Parse(line[0]), m = int.Parse(line[1]);
    var arr = new List<string>();
    while((line[0] = Console.ReadLine()) != null) arr.Add(line[0]);
    for(int i = 0; i < n; i++) {
      int sum = 0;
      for(int j = 0; j < m; j++) sum += int.Parse(arr[i].Split()[j]) * int.Parse(arr[n+j]);
      Console.WriteLine(sum);
    }
  }
}
