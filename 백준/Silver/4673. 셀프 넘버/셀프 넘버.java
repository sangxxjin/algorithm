public class Main {
    public static int count (int a){
        int sum=a;
        while(a!=0){
            sum=sum+(a%10);
            a/=10;
        }return sum;
    }
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];
        for (int i = 1; i <10001; i++) {
            int a = count(i);
            if(a<10001){
                check[a]=true;
            }
        }
        for (int i = 1; i < 10001; i++) {
            if(check[i]==false){
                System.out.println(i);
            }
        }
    }
}
