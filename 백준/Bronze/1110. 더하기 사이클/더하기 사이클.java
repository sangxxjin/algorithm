import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int count=0;
        int A = N;
        while (true) {
            if ((A/10+A%10)>9) A=A%10*10+(A/10+A%10)-10;
            else A=A%10*10+(A/10+A%10);
            count++;
            if(N==A) break;
        }
        System.out.println(count);
    }
}