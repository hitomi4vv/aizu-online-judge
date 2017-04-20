import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), m = sc.nextInt();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    while(sc.hasNextInt()) arr.add(sc.nextInt());
    for(int i = 0; i < n; i++) {
      int sum = 0;
      for(int j = 0; j < m; j++) sum += arr.get(i*m+j) * arr.get(n*m+j);
      System.out.println(sum);
    }
  }
}
