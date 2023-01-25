import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count=0;
        for (int a = 1; a <= 500; a++) {
            for (int b = 1; b <= 500; b++) {
                int A=a*a;
                int B=b*b;
                if(B-A == N)count++;
            }
        }
        System.out.println(count);
    }
}
