import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int round = scanner.nextInt();
        for (int i = 0; i < round; i++) {
            int a = scanner.nextInt();
            int b= scanner.nextInt();
            int count = 0;
            for (int j = a; j <=b; j++) {
                int p=j;
                if(p==0)count++;
                while(p>=1){
                    if(p%10==0)count++;
                    p/=10;
                }
            }
            System.out.println(count);
        }
    }
}
