using System;
using System.Linq;
public class Program {
  public static void Main() {
    string w = Console.ReadLine(), t;
    int c = 0;
    while ((t = Console.ReadLine()) != "END_OF_TEXT")
      c += t.Split().Count(s => s.Equals(w, System.StringComparison.OrdinalIgnoreCase));
    Console.WriteLine(c);
  }
}
