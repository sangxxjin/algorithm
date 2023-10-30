import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public int solution(String[] s1, String[] s2) {
    int answer = 0;
    List<String> list1 = Arrays.asList(s1);
    List<String> list2 = Arrays.asList(s2);
    for (int i = 0; i < list2.size(); i++) {
      if(list1.contains(list2.get(i)))answer++;
    }
    return answer;
  }
}