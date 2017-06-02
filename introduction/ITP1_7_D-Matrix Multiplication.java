import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), m = sc.nextInt(), l = sc.nextInt();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    while(sc.hasNextInt()) arr.add(sc.nextInt());
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < l; j++) {
        System.out.println(i+":"+j);
      }
    }
  }
}
