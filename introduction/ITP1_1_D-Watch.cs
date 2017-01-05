using System;

public class Program {
  public static void Main() {
    int time = Int32.Parse(Console.ReadLine());
    int hour = time / 3600;
    int minutes = (time / 60) % 60;
    int seconds = time % 60;
    Console.WriteLine("{0}:{1}:{2}", hour, minutes, seconds);
  }
}
