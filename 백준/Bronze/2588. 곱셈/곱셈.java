import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = 0;int count=1;
        for (int i = 0; i < 3; i++) {
            sum+=A*(B%10)*count;
            System.out.println(A*(B%10));
            B/=10; count*=10;
        }
        System.out.println(sum);
    }
}