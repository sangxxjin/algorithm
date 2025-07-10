import java.util.*;

class Solution {
    private int dateToDays(String dateStr) {
        String[] parts = dateStr.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        return (year * 12 * 28) + (month * 28) + day;
    }

    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();

        int todayInDays = dateToDays(today);

        Map<String, Integer> termDurations = new HashMap<>();
        for (String term : terms) {
            String[] parts = term.split(" ");
            termDurations.put(parts[0], Integer.parseInt(parts[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String privacy = privacies[i];
            String[] parts = privacy.split(" ");
            String collectedDateStr = parts[0];
            String termType = parts[1];

            int collectedDateInDays = dateToDays(collectedDateStr);
            int durationInMonths = termDurations.get(termType);

            int expirationDateInDays = collectedDateInDays + (durationInMonths * 28);

            if (expirationDateInDays <= todayInDays) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}