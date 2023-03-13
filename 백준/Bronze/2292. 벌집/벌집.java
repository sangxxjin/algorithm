import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int i =1;
            int count=1;
            while(N>1){
                N-=6*i;
                i++;
                count++;
            }
            System.out.println(count);
        }
    }
