import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int width = 3;
        int[] arr = new int[16];
        for(int i=1; i<arr.length; i++) {
            arr[i] = width * width;
            width = width + (width-1);
        }
        System.out.println(arr[N]);
        scan.close();
    }
}
