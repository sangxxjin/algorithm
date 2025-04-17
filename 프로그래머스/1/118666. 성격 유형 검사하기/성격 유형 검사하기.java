import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> scoreMap = new HashMap<>();
        for (char c : new char[] {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'}) {
            scoreMap.put(c, 0);
        }

        for (int i = 0; i < survey.length; i++) {
            String s = survey[i];
            int choice = choices[i];
            
            char disagree = s.charAt(0);
            char agree = s.charAt(1);
            
            if (choice < 4) {
                scoreMap.put(disagree, scoreMap.get(disagree) + 4 - choice);
            } 
            if (choice > 4) {
                scoreMap.put(agree, scoreMap.get(agree) + choice - 4);
            }
        }

        StringBuilder result = new StringBuilder();
        result.append(scoreMap.get('R') >= scoreMap.get('T') ? 'R' : 'T');
        result.append(scoreMap.get('C') >= scoreMap.get('F') ? 'C' : 'F');
        result.append(scoreMap.get('J') >= scoreMap.get('M') ? 'J' : 'M');
        result.append(scoreMap.get('A') >= scoreMap.get('N') ? 'A' : 'N');

        return result.toString();
    }
}
