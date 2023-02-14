import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        for (int i = 0; i < C; i++) {
            int N = sc.nextInt();
            int avg = 0; double cnt = 0;
            double per=0;
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j]= sc.nextInt();
                avg+=arr[j];
            }
            avg/=N;
            for (int j = 0; j < N; j++) {
                if (arr[j]>avg) cnt++;
            }per= (cnt*100/N);
            System.out.printf("%.3f%%\n",per);
        }
    }
}
