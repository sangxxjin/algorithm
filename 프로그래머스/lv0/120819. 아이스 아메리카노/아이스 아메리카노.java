class Solution {
    public int[] solution(int money) {

        int count=0;
        while (true){
            if (money>=5500){
                money-=5500;
                count++;
            }
            else break;
        }int[] answer = {count,money};

        return answer;
    }
}