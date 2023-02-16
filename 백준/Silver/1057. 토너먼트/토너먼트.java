import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int jimin = sc.nextInt();
        int hansu = sc.nextInt();
        int count =0;
        while(jimin!=hansu){
            jimin=jimin/2+jimin%2;
            hansu=hansu/2+hansu%2;
            count++;
        }
        System.out.println(count);
    }
}