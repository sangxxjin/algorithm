import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N+1];
        int sub = 0;
        for (int i = 1; i <=N; i++) {
            arr[i]=i;
        }
        for (int a  = 0; a < M; a++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            sub=arr[i];
            arr[i]=arr[j];
            arr[j]=sub;
        }
        for (int i = 1; i <=N ; i++) {
            System.out.printf(arr[i]+" ");
        }
    }
}
