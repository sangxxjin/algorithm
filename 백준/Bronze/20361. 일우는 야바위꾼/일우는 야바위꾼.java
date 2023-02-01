import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N+1];
        for (int i = 1; i <= N; i++) {
            arr[i]=0;
        }
        arr[X]=1;
        int sub=0;
        for (int i = 0; i < K; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sub=arr[a];
            arr[a]=arr[b];
            arr[b]=sub;
        }
        for (int i = 1; i <= N; i++) {
            if(arr[i]==1) System.out.println(i);
        }
    }
}
