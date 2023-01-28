import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count=0;
        int ex=0;
        for (int i = 0; i <= N; i++) {
            ex=i;
            while (ex!=0){
             if(ex%10==3||ex%10==6||ex%10==9)
                 count++;
             ex/=10;
            }
        }
        System.out.println(count);
    }
}
