import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt(), c = sc.nextInt();
    int[] arr = new int[c+1];
    for(int i = 0; i < r; i++) {
      int sum = 0;
      for(int j = 0; j < c; j++) {
        int v = sc.nextInt();
        System.out.print(v+" ");
        sum += v;
        arr[j] += v;
        arr[c] += v;
      }
      System.out.println(sum);
    }
    for(int j = 0; j < c; j++) System.out.print(arr[j]+" ");
    System.out.println(arr[c]);
  }
}
