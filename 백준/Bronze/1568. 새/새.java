import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = 1;
        int count=0;
        while (true){
            if (N==0)break;
            if (K>N) K=1;
            N-=K;
            K++;
            count++;

        }
        System.out.println(count);
    }
}