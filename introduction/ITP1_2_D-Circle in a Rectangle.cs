using System;

public class Program {
  public static void Main() {
    var line = Console.ReadLine().Split();

    int w = int.Parse(line[0]);
    int h = int.Parse(line[1]);
    int x = int.Parse(line[2]);
    int y = int.Parse(line[3]);
    int r = int.Parse(line[4]);

    if (r <= x && x <= w - r && r <= y && y <= h - r) {
      Console.WriteLine("Yes");
    } else {
      Console.WriteLine("No");
    }
  }
}
