import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

class Solution {
  public String solution(int a, int b) {
    String answer = "";
    LocalDate date = LocalDate.of(2016,a,b);
    DayOfWeek dayOfWeek = date.getDayOfWeek();
    String sub = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.US);
    sub = sub.toUpperCase();
    for (int i = 0; i < 3; i++) {
      answer+=sub.charAt(i);
    }
    return answer;
  }
}