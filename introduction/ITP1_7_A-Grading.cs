using System;
using System.Linq;

public class Program {
  public static void Main() {
    string line;
    while ((line = Console.ReadLine()) != "-1 -1 -1") {
      int[] arr = line.Split().Select(int.Parse).Take(3).ToArray();
      int m = arr[0], f = arr[1], r = arr[2];
      string grade = "F";
      if(m != -1 && f != -1 && m+f >= 30) {
        grade = "D";
        if(m+f >= 50 || r >= 50) grade = "C";
        if(m+f >= 65) grade = "B";
        if(m+f >= 80) grade = "A";
      }
      Console.WriteLine(grade);
    }
  }
}
