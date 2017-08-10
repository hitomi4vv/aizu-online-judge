using System;
public class Program {
  public static void Main() {
    int t=0, h=0, n=int.Parse(Console.ReadLine());
    for(int i = 0; i < n; i++) {
      var arr = Console.ReadLine().Split();
      var s = string.Compare(arr[0], arr[1]);
      if(s == 0){t++;h++;}else if(s > 0) t+=3; else if(s < 0) h+=3;
    }
    Console.WriteLine(t+" "+h);
  }
}
