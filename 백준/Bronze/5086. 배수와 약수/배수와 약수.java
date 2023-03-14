import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while(true){
                int P = sc.nextInt();
                int F = sc.nextInt();
                if (P==F) break;
                if(F%P==0) System.out.println("factor");
                else if (P%F==0) System.out.println("multiple");
                else System.out.println("neither");
            }
        }
    }