import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (isCorrect(rotated)) answer++;
        }
        return answer;
    }

    private boolean isCorrect(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (isOpen(cur)) {
                stack.push(cur);
            } else {
                if (stack.isEmpty()) return false;
                if (!isSet(stack.peek(), cur)) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    private boolean isOpen(char c){
        return c == '(' || c == '{' || c == '[';
    }

    private boolean isSet(char a, char b){
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }
}
