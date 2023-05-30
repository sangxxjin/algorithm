import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] arr = new int[B];
        int idx = 0;
        for (int i = 1; i <= B; i++) {
            for (int j = 0; j < i; j++) {
                if (idx==B)break;
                arr[idx]=i;
                idx++;
            }
        }
        int sum = 0;
        for (int i = A; i <= B; i++) {
            sum+=arr[i-1];
        }
        System.out.println(sum);
    }
}