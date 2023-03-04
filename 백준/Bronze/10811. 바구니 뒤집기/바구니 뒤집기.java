import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N+1];
        int sum=0;
        for (int i = 1; i <= N; i++) {
            arr[i]=i;
        }
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int j = sc.nextInt();
            while (true){
                sum=arr[a];
                arr[a]=arr[j];
                arr[j]=sum;
                a++;j--;
                if(a==j) break;
                if(j<a) break;
            }
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}