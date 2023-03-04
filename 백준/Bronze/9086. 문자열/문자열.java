import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String S = sc.next();
            int l = S.length();
            char S1 = S.charAt(0);
            char S2 = S.charAt(l-1);
            System.out.println(S1+""+S2);
        }
    }
}