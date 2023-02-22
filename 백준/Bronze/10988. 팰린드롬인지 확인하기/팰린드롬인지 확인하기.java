import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int mid = S.length()/2;
        int check=1;
        for (int i = 0; i < mid; i++) {
            if(S.charAt(i)!=S.charAt(S.length()-1-i))
                check=0;
        }
        System.out.println(check);
    }
}