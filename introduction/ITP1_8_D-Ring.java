import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next(), p = sc.next();
    System.out.println((s+s).contains(p)? "Yes":"No");
  }
}
