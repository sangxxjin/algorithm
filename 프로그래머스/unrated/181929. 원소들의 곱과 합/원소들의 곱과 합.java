class Solution {
  public int solution(int[] num_list) {
    int answer = 0;
    int numMultiply=1;
    int numSum=0;
    for (int i = 0; i < num_list.length; i++) {
      numSum+=num_list[i];
      numMultiply*=num_list[i];
    }
    if (Math.sqrt(numMultiply)<numSum)answer=1;
    return answer;
  }
}