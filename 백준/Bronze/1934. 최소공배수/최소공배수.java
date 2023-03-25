import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int sum=1;
            for (int j = 1; j < A+B; j++) {
                if (A%j==0 && B%j==0){
                    sum*=j;
                    A/=j;
                    B/=j;
                    j=1;
                }
            }
            System.out.println(sum*A*B);
        }
    }
}