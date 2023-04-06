import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int[] arr1 = new int[2];
        int sum=0;
        for (int i = 0; i < 9; i++) {
            arr[i]= sc.nextInt();
            sum+=arr[i];
        }sum-=100;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i]+arr[j]==sum){
                    arr1[0]=i;
                    arr1[1]=j;
                    break;
                }
            }
        }
        arr[arr1[0]]=0;
        arr[arr1[1]]=0;
        Arrays.sort(arr);
        for (int i = 2; i < 9; i++) {
            System.out.println(arr[i]);
        }
    }
}