class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i=1; i<food.length; i++){
            for(int j=0; j<food[i]/2; j++){
                answer+=i;                
            }
            
        }
        return makeResult(answer);
    }
    private String makeResult(String s) {
        StringBuffer sb = new StringBuffer(s);
        String sbReverse = sb.reverse().toString();
        return s + "0" + sbReverse;
    }
}