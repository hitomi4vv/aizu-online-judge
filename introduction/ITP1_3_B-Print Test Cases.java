import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 1;
    while (true) {
      String line = sc.next();
      if (line.equals("0")) {
        break;
      }
      System.out.println("Case " + count + ": " + line);
      count++;
    }
  }
}
