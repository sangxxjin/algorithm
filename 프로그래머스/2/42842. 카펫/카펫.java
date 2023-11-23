class Solution {
  public int[] solution(int brown, int yellow) {
    int[] answer = new int[2];

    for(int depth=3;depth<brown+yellow;depth++){
      int width = (brown+yellow)/depth;
      if(width>=depth){
        if ((depth - 2) * (width - 2) == yellow) {
          answer[0] = width;
          answer[1] = depth;
          break;
        }
      }
    }
    return answer;
  }
}