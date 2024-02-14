class Solution {
  public static String solution(int[] food) {
    String answer = "";
    for(int i=0; i<food.length; i++){
      int div = food[i]/2;
      while(div>0){
        answer+=i;
        div--;
      }
    }answer+="0";
    for(int i = answer.length()-2; i>=0; i--){
      answer+=answer.charAt(i);
    }
    return answer;
  }

}