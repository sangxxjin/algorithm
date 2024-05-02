import java.util.Arrays;

class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2]; 
        
        int n = num1*num2;
        int de = denum1*num2+denum2*num1;
        int max = 1;  
        
        for(int i=1; i <= n && i<= de; i++){
            if(n%i==0 && de%i==0){
                max = i;
            }
        }
        answer[0] = de/max;
        answer[1] = n/max;
        
        return answer;
    }
}