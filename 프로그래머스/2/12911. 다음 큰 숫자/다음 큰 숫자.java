class Solution {

  public int solution(int n) {
    int answer = n;
    int inputBit = Integer.bitCount(n);

    while (true) {
      int answerBit = Integer.bitCount(++answer);

      if (answerBit == inputBit) {
        break;
      }
    }

    return answer;
  }
}