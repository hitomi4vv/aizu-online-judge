import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] line = sc.nextLine().split(" ");

    int a = Integer.parseInt(line[0]);
    int b = Integer.parseInt(line[1]);
    int c = Integer.parseInt(line[2]);
    int count = 0;
    for (int num = a; num <= b; num++) {
      if (c % num == 0) {
        count++;
      }
    }
    System.out.println(count);
  }
}
