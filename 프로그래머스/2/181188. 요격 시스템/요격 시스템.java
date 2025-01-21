import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        
        Arrays.sort(targets, (o1, o2) -> o1[1] - o2[1]);
        
        int lastEndTime = 0;
        for(int[] target : targets){
            if(lastEndTime <= target[0]){
                lastEndTime = target[1];
                answer++;
            }
        }
        
        return answer;
    }
}
