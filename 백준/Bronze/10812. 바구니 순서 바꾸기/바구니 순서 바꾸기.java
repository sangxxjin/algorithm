import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N+1];
        int[] sub = new int[N+1];
        for (int i = 0; i < N+1; i++) {
            arr[i]=i;
        }
        for (int a = 0; a < M; a++) {
            int i=sc.nextInt();
            int j=sc.nextInt();
            int k=sc.nextInt();
            for (int l = 0; l < k-i; l++) {
                sub[l]=arr[i+l];;
            }
            for (int l = 0; l <= j-k ; l++) { 
                arr[i+l]=arr[k+l];
            }
            for (int l = 0; l < k-i ; l++) { 
                arr[i+(j-k+1)+l]=sub[l];
            }
        }
        for (int i = 1; i < N+1; i++) {
            System.out.printf(arr[i]+" ");
        }
    }
}
