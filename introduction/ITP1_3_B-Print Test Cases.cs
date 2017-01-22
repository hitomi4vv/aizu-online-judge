using System;

public class Program {
  public static void Main() {
    int count = 1;
    String line;
    while ((line = Console.ReadLine()) != "0") {
      Console.WriteLine("Case " + count + ": " + line);
      count++;
    }
  }
}
