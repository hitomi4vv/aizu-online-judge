import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();

    int x = Integer.parseInt(line);
    
    System.out.println((int) Math.pow(x, 3));
  }
}
