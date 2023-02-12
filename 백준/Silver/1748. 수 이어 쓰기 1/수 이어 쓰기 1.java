import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ten=10;
        int count=1;
        int sum=0;
        for (int i = 1; i <= N; i++) {
            if(i%ten==0){
                count++;
                ten*=10;
            }
            sum+=count;
        }
        System.out.println(sum);
    }
}
