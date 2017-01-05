import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] str = sc.nextLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    if (a == b) {
      System.out.println("a == b");
    } else if (a > b) {
      System.out.println("a > b");
    } else {
      System.out.println("a < b");
    }
  }
}
