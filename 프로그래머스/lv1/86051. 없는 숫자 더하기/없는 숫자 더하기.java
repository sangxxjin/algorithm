class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int sum = 0;
        int rsum=0;
        for (int i = 1; i <= 9; i++) {
            sum+=i;
        }
        for (int i = 0; i < numbers.length; i++) {
            rsum+=numbers[i];
        }
        answer=sum-rsum;
        return answer;
    }
}