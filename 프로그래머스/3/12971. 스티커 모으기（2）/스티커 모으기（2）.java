class Solution {
    public int solution(int sticker[]) {
        int answer = 0;
        if(sticker.length == 1){
            return sticker[0];
        }else if(sticker.length == 2){
            return Math.max(sticker[0], sticker[1]);
        }
        int[] dp = new int[sticker.length-1];
        dp[0] = sticker[0];
        dp[1] = sticker[0];
        for(int i= 2; i<sticker.length-1; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+sticker[i]);
        }
        int[] dp1 = new int[sticker.length];
        dp1[0] = 0;
        dp1[1] = sticker[1];
        for(int i = 2; i<sticker.length; i++){
            dp1[i] = Math.max(dp1[i-1], dp1[i-2]+sticker[i]);
        }
        answer = Math.max(dp[dp.length-1], dp1[dp1.length-1]);
        return answer;
    }
}