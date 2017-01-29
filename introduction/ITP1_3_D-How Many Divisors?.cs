using System;

public class Program {
  public static void Main() {
    var line = Console.ReadLine().Split();

    int a = int.Parse(line[0]);
    int b = int.Parse(line[1]);
    int c = int.Parse(line[2]);
    int count = 0;
    while(a <= b) {
      if(c % a == 0) {
        count++;
      }
      a++;
    }
    
    Console.WriteLine(count);
  }
}
