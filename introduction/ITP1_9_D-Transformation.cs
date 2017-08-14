using System;
public class Program {
  public static void Main() {
    var s = Console.ReadLine();
    int n = int.Parse(Console.ReadLine());
    for(int i = 0; i < n; i++) {
      var arr = Console.ReadLine().Split();
      int a = int.Parse(arr[1]), b = int.Parse(arr[2])-a+1;
      switch(arr[0]) {
        case "print":
          Console.WriteLine(s.Substring(a, b));
          break;
        case "reverse":
          char[] ss = s.Substring(a, b).ToCharArray();
          Array.Reverse(ss);
          s = s.Remove(a, b).Insert(a, new string(ss));
          break;
        case "replace":
          s = s.Remove(a, b).Insert(a, arr[3]);
          break;
      }
    }
  }
}
