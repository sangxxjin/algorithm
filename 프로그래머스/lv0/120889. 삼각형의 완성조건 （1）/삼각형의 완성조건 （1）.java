class Solution {
  public int solution(int[] sides) {
    int maxidx=0;
    int max = 0;
    for (int i = 0; i < sides.length; i++) {
      if (sides[i]>max) {
        max = sides[i];
        maxidx = i;
      }
    }
    int comparemax=0;
    for (int i = 0; i < sides.length; i++) {
      if (i==maxidx)continue;
      comparemax+=sides[i];
    }
    int answer = 0;
    if (max>=comparemax)answer=2;
    if (max<comparemax)answer=1;
    return answer;
  }
}