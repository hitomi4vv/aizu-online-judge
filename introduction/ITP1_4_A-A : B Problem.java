import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] line = sc.nextLine().split(" ");

    int a = Integer.parseInt(line[0]);
    int b = Integer.parseInt(line[1]);
    System.out.printf("%d %d %f", a/b, a%b, (double)a/b);
  }
}
