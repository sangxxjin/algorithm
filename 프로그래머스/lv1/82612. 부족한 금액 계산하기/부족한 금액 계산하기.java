class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long need = 0;
        for (int i = 1; i <= count; i++) {
            need+=price*i;
        }
        answer=need-money;
        if (answer<0) answer=0;
        return answer;
    }
}