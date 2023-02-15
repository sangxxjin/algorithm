import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count=0;
        for (int i = 1 ; i <= N; i++) {
            if(i<100)count++;
            if (100<=i&&i<=1000) {
                if((i/10%10-i%10)==(i/100-i/10%10))count++;
            }
        }
        System.out.println(count);
    }
}