import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line;
    while(!(line = sc.nextLine()).equals("0")) {
      int sum = 0;
      for(int i = 0; i < line.length(); i++) sum += Character.getNumericValue(line.charAt(i));
      System.out.println(sum);
    }
  }
}
