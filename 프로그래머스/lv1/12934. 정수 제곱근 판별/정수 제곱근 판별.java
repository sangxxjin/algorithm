class Solution {
    public long solution(long n) {
        long answer = -1;
        int a = (int) Math.sqrt(n);
        if (Math.pow((long)Math.sqrt(n),2)==n)
            answer= (long)Math.pow((long)Math.sqrt(n)+1,2);
        return answer;
    }
}