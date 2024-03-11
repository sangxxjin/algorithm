import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        String[] splitX = myString.split("x",-1);
        for(int i=0; i<splitX.length; i++){
            answer.add(splitX[i].length());
        }

        return answer;
    }
}