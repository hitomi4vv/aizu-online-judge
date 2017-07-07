import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] s = new int[26];
    while(sc.hasNext()) {
      char[] line = sc.next().toLowerCase().toCharArray();
      for (char c:line) if (Character.isLetter(c)) s[c-'a']++;
    }
    for(int i = 0; i < 26; ++i) System.out.println((char)('a'+i) + " : " + s[i]);
  }
}
