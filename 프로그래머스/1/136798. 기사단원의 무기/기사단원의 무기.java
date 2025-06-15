class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i<=number; i++){
            int count = countDivisors(i);
            if(count>limit)answer+=power;
            else answer+=count;
        }
        return answer;
    }
    private int countDivisors(int num){
        int count=0;
        for(int i=1; i<=Math.sqrt(num);i++){
            if(num%i==0){
                count++;
                //약수일때 다른 한쪽의 약수도 추가
                if(i != num/i) count++;
            }
        }
        return count;
    }
}