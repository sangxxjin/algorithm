class Solution {
    public int solution(int n) {
        int answer = 0;
        String binary = Integer.toBinaryString(n);
        int count = 0;
        for(char a : binary.toCharArray()){
            if(a=='1')count++;
        }
        
        while(true){
            String answerBinary = Integer.toBinaryString(++n);
            int answerCount = 0;
             for(char a : answerBinary.toCharArray()){   
                if(a=='1')answerCount++;
             }
            if(count==answerCount){
                answer = n;
                break;
            }
        }
        return answer;
    }
}