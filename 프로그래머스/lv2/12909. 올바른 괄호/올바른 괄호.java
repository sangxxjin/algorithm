class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i]=s.charAt(i);
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]=='(')count++;
            if (arr[i]==')')count--;
            if (count<0){
                answer=false;
                break;
            }
        }
        if (count!=0)answer=false;
        return answer;
    }
}