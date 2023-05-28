import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String str = sc.next();
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j)=='(')count++;
                if (str.charAt(j)==')')count--;
                if (count<0){
                    System.out.println("NO");
                    break;
                }
                if (j==str.length()-1){
                    if (count>0) System.out.println("NO");
                    else System.out.println("YES");
                }
            }
        }
    }
}