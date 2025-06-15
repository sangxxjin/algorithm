import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String str : skill_trees) {
            Deque<Character> deque = new ArrayDeque<>();
            for (char c : skill.toCharArray()) {
                deque.offerLast(c);
            }

            boolean isValid = true;
            for (char current : str.toCharArray()) {
                if (!skill.contains(String.valueOf(current))) continue;

                if (!deque.isEmpty() && current == deque.peekFirst()) {
                    deque.pollFirst(); 
                } else {
                    isValid = false;
                    break;
                }
            }

            if (isValid) answer++;
        }

        return answer;
    }
}
