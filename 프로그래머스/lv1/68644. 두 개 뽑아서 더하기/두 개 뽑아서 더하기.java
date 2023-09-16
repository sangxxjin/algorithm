import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class Solution {
  public int[] solution(int[] numbers) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int i = 0; i < numbers.length-1; i++) {
      for (int j = i+1; j < numbers.length; j++) {
        if (arrayList.contains(numbers[i]+numbers[j]))continue;
        arrayList.add(numbers[i]+numbers[j]);
      }
    }
    Collections.sort(arrayList);
    int[] answer = new int[arrayList.size()];
    for (int i = 0; i < arrayList.size(); i++) {
      answer[i] = arrayList.get(i);
    }
    return answer;
  }
}