using System;
public class Program {
  public static void Main() {
    var line = Console.ReadLine().Split();
    int n = int.Parse(line[0]), m = int.Parse(line[1]), l = int.Parse(line[2]), i, j, k;
    var a = new long[n, m];
    var b = new long[m, l];
    var c = new long[n, l];
    for(i = 0; i < n; i++) {
      line = Console.ReadLine().Split();
      for(j = 0; j < m; j++) a[i, j] = long.Parse(line[j]);
    }
    for(i = 0; i < m; i++) {
      line = Console.ReadLine().Split();
      for(j = 0; j < l; j++) b[i, j] = long.Parse(line[j]);
    }
    for(i = 0; i < n; i++)
      for(j = 0; j < l; j++) {
        for(k = 0; k < m; k++) c[i, j] += a[i, k] * b[k, j];
        Console.Write(c[i, j] + (j+1 == l? "\n":" "));
      }
  }
}
