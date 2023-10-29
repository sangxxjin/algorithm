import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public int[] solution(int n) {

    List<Integer> arr = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      if (i%2==1)arr.add(i);
    }
    int[] answer = new int[arr.size()];
    for (int i = 0; i < arr.size(); i++) {
      answer[i]=arr.get(i);
    }
    return answer;
  }
}