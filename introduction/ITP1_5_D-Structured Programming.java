import java.util.*;

public class Main {
  public static void main(String[] args) {
    int n = new Scanner(System.in).nextInt();
    String str = "";
    for(int i = 3; i <= new Scanner(System.in).nextInt(); i++)
      if(i%3 == 0 || Integer.toString(i).indexOf("3") >= 0) str += " " + i;
    System.out.println(str);
  }
}
