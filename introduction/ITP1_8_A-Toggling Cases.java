import java.util.*;
public class Main {
  public static void main(String[] args) {
    char[] chars = new Scanner(System.in).nextLine().toCharArray();
    for(char c:chars) System.out.print(Character.isUpperCase(c)? Character.toLowerCase(c):Character.toUpperCase(c));
    System.out.println();
  }
}
