using System;
public class Program {
  public static void Main() {
    string s = Console.ReadLine(), p = Console.ReadLine();
    Console.WriteLine((s+s).Contains(p)? "Yes":"No");
  }
}
