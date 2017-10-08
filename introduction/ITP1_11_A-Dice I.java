import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Dice dice = new Dice(sc.nextLine().split(" "));
    char[] chars = sc.nextLine().toCharArray();
    for(char c:chars) dice.roll(c);
  }
}

class Dice {
  private String[] labels = new String[6];
  Dice(String[] labels) {
    this.labels = labels;
  }
  public void roll(char dir) {
    System.out.println(dir);
  }
}
