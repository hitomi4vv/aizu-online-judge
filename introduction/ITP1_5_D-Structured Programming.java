import java.util.*;

public class Main {
  public static void main(String[] args) {
    int n = new Scanner(System.in).nextInt();
    for(int i = 3; i <= n; i++)
      if(i%3 == 0 || Integer.toString(i).indexOf("3") >= 0) System.out.print(" " + i);
    System.out.println();
  }
}
