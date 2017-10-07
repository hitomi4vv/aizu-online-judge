import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Dice dice = new Dice(sc.nextLine().split(" "));
    dice.roll();
  }
}

class Dice {
  private String[] labels = new String[6];
  Dice(String[] labels) {
    this.labels = labels;
  }
  public void roll() {
    System.out.println(labels[0]);
  }
}
