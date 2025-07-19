import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public boolean isAnagram(String s, String t) {
      if(s.length()!=t.length()){
        return false;
      }
      char[] sch=s.toCharArray();
      char[] tch=t.toCharArray();
      Arrays.sort(sch);
      Arrays.sort(tch);
      return Arrays.equals(sch,tch);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.next();
        String t=sc.next();

        Anagram a=new Anagram();
        System.out.println(a.isAnagram(s, t));
        sc.close();
    }
    
}