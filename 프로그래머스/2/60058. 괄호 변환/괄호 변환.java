import java.util.*;

class Solution {
    int splitIndex;

    public String solution(String p) {
        // 1번 요구사항
        if (p.isEmpty()) {
            return p;
        }
        // 2번 요구사항
        boolean isValid = splitToBalancedString(p);
        String u = p.substring(0, splitIndex);
        String v = p.substring(splitIndex);

        // 3번 요구사항
        if (isValid) {
            return u + solution(v);
        } 
        // 4번 요구사항
        else {
            StringBuilder result = new StringBuilder();
            // 4-1번 요구사항
            result.append("(");
            // 4-2번 요구사항
            result.append(solution(v));
            // 4-3번 요구사항
            result.append(")");
            // 4-4번 요구사항
            for (int i = 1; i < u.length() - 1; i++) {
                result.append(u.charAt(i) == '(' ? ")" : "(");
            }
            return result.toString();
        }
    }

    public boolean splitToBalancedString(String s) {
        Stack<Character> stack = new Stack<>();
        boolean isValid = true;
        int openCount = 0;
        int closeCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openCount++;
                stack.push('(');
            } else {
                closeCount++;
                if (stack.isEmpty()) {
                    isValid = false;
                } else {
                    stack.pop();
                }
            }

            if (openCount == closeCount) {
                splitIndex = i + 1;
                return isValid;
            }
        }
        return true;
    }
}
