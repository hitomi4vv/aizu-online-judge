using System;
using System.Linq;
public class Program {
  public static void Main() {
    string line;
    int[] s = new int[26];
    while ((line = Console.ReadLine()) != null)
      foreach(int i in line.ToLower().ToCharArray().Select(c => c-'a').Where(c => c>-1).ToArray()) s[i]++;
    for(int i = 0; i < 26; i++) Console.WriteLine((char)('a'+i) + " : " + s[i]);
  }
}
