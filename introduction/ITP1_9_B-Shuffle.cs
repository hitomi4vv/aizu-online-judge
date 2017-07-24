using System;
public class Program {
  public static void Main() {
    string s;
    while ((s = Console.ReadLine()) != "-") {
      int n = int.Parse(Console.ReadLine());
      for(int i = 0; i < n; i++) {
        int h = int.Parse(Console.ReadLine());
        s = s.Remove(0, h) + s.Substring(0, h);
      }
      Console.WriteLine(s);
    }
  }
}
