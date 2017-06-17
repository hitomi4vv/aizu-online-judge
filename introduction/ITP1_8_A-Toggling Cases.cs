using System;
public class Program {
  public static void Main() {
    var line = Console.ReadLine();
    foreach(var c in line) Console.Write(char.IsLower(c)? char.ToUpper(c):char.ToLower(c));
    Console.WriteLine();
  }
}
