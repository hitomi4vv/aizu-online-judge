using System;

public class Program {
  public static void Main() {
    while(true) {
      var line = Console.ReadLine().Split();
      int h = int.Parse(line[0]);
      int w = int.Parse(line[1]);
      if(h + w == 0) break;
      for(int i = 0; i < h; i++) {
        Console.Write("#");
        for(int j = 0; j < w-2; j++) Console.Write((i != 0 && h-i-1 != 0)? '.':'#');
        Console.WriteLine("#");
      }
      Console.WriteLine();
    }
  }
}
