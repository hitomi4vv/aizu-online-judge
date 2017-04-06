using System;
using System.Collections.Generic;

public class Program {
  public static void Main() {
    int n = int.Parse(Console.ReadLine());
    var cards = new List<string>();
    for(int i = 0; i < n; i++) cards.Add(Console.ReadLine());
    var suit = new List<string> {"S", "H", "C", "D"};
    for(int i = 0; i < 4; i++) {
      for(int j = 1; j < 14; j++) {
        string card = suit[i] + " " + j;
        if(!cards.Contains(card)) Console.WriteLine(card);
      }
    }
  }
}
