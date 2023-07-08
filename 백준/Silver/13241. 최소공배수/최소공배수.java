import java.util.Scanner;

public class Main {
    public static long gcd(long a, long b){
        while(b!=0){
            long num=a%b;
            a=b;
            b=num;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();

        long answer = a * b / gcd(a, b);

        System.out.println(answer);
    }
}
