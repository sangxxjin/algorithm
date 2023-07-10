class Solution {
    public int solution(int n) {
        int answer = 1;
        while (true){
            if (n<=7)break;
            n-=7;
            answer++;
        }
        return answer;
    }
}