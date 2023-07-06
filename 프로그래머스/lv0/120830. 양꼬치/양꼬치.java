class Solution {
    public int solution(int n, int k) {
        int count=0;
        while (n>=10){
            n-=10;
            k--;
            count++;
        }
        int answer = (n+count*10)*12000+k*2000;
        return answer;
    }
}