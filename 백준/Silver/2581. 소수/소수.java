import java.util.Scanner;
public class Main {//2581
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[N - M + 1];
        int a = 0;
        for (int i = M; i <= N; i++) {
            int count = 0;
            if (i==1)count++;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) count++;
            }
            if (count == 0) {
                arr[a] = i;
                a++;
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (arr[0] == 0) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(arr[0]);
        }
    }
}