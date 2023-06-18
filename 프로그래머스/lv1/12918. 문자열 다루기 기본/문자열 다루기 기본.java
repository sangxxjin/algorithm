class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length()!=4&&s.length()!=6)answer=false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)<=90&&s.charAt(i)>=65){
                answer=false;
                break;
            }
            if (s.charAt(i)<=122&&s.charAt(i)>=97){
                answer=false;
                break;
            }
        }
        return answer;
    }
}