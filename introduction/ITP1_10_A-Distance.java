import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double p1 = sc.nextDouble(), p2 = sc.nextDouble(), p3 = sc.nextDouble(), p4 = sc.nextDouble();
    System.out.println(Math.hypot(p3-p1, p4-p2));
  }
}
