
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double max = 0;
        double sum = 0;
        int N = sc.nextInt();
        double[] arr= new double[N];
        for (int i = 0; i < N; i++) {
            arr[i]= sc.nextInt();
            if(arr[i]>max) max=arr[i];
        }
        for (int i = 0; i < N; i++) {
            arr[i]/=max;
            arr[i]*=100;
            sum+=arr[i];
        }
        sum/=(double)N;
        System.out.println(sum);
    }
}