import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.nextLine();
    List<String> list = Arrays.asList(sc.nextLine().split(" "));
    Collections.reverse(list);
    System.out.println(String.join(" ", list));
  }
}
