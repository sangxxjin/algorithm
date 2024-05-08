class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String replacedStr = myString.replace('A', '1').replace('B', 'A').replace('1', 'B');
        
        if (replacedStr.contains(pat)) {
            return 1;
        }
        
        return answer;
    }
}