import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int first = sc.nextInt();
            int end = sc.nextInt();
            int num = sc.nextInt();
            for (int j = first-1; j < end; j++) {
                arr[j]=num;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i]+" ");
        }
    }
}