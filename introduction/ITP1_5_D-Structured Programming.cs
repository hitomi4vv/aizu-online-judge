using System;

public class Program {
  public static void Main() {
    int n = int.Parse(Console.ReadLine());
    for(int i = 3; i <= n; i++)
      if(i%3 == 0 || i.ToString().Contains("3")) Console.Write(" " + i);
    Console.WriteLine();
  }
}
