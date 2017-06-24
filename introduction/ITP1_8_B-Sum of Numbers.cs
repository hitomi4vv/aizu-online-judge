using System;
using System.Linq;
public class Program {
  public static void Main() {
    string line;
    while ((line = Console.ReadLine()) != "0") Console.WriteLine(line.ToCharArray().Select(c => c - '0').Sum());
  }
}
