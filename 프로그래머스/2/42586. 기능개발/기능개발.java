import java.util.*;
class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<progresses.length; i++){
            queue.add((int)Math.ceil((double)(100-progresses[i])/speeds[i]));
        }
        while(!queue.isEmpty()){
            int count = 1;
            int min = queue.poll();
            while(!queue.isEmpty() && (queue.peek()<=min)){
                queue.poll();
                count++;
            }
            answer.add(count);
        }
        return answer;
    }
}