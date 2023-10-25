class Solution {
  public int solution(int n) {
    int answer = 0;
    double sqrt = Math.sqrt((double)n);
    if (n==(int)sqrt*sqrt)answer=1;
    else answer=2;
    return answer;
  }
}