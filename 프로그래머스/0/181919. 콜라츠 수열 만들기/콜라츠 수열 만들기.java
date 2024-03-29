import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        while (n!=1){
            if (n%2==0) {
                answer.add(n);
                n /= 2;
            }
            else {
                answer.add(n);
                n = n*3+1;
            }
        }
        answer.add(1);
        
        return answer;
    }
}