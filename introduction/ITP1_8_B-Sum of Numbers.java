import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line;
    while(!(line = sc.nextLine()).equals("0")) {
      int sum = 0;
      int[] arr = line.chars().map(x -> x-'0').toArray();
      for(int i:arr) sum += i;
      System.out.println(sum);
    }
  }
}
