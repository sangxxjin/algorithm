import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        String S = sc.next();
        for (int i = 0; i < S.length(); i++) {
            if('A'<= S.charAt(i)&&S.charAt(i)<='Z'){
                arr[S.charAt(i)-'A']++;
            }
            if('a'<= S.charAt(i)&&S.charAt(i)<='z'){
                arr[S.charAt(i)-'a']++;
            }
        }
        int max = 0;
        char ch ='?';
        for (int i = 0; i < 26; i++) {
            if(arr[i]>max){
                max=arr[i];
                ch=(char)(i + 'A');
            }
            else if(arr[i]==max)
                ch='?';
        }
        sc.close();
        System.out.println(ch);
    }
}