using System;
using System.Linq;
public class Program {
  public static void Main() {
    string line;
    var s = new int[26];
    while ((line = Console.ReadLine()) != null) {
      line.ToLower().ToCharArray().Select(c => s[c-'a']++);
    }
  }
}
