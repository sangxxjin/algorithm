import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Deque<Integer> deq = new ArrayDeque<>();
        deq.offer(0);
        for(int i=1; i<numbers.length; i++){
            while (!deq.isEmpty() && numbers[deq.peek()] < numbers[i]) {
                answer[deq.poll()] = numbers[i];
            }
            deq.offerFirst(i);
        }
        while (!deq.isEmpty()) {
            answer[deq.poll()] = -1;
        }
        return answer;
    }
}