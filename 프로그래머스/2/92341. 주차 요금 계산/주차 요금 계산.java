import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int basicTime = fees[0];
        int basicFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];

        Map<String, Integer> inTime = new HashMap<>();
        Map<String, Integer> totalParkingTime = new HashMap<>();

        for (String record : records) {
            String[] parts = record.split(" ");
            int time = parseTimeToMinutes(parts[0]);
            String carNumber = parts[1];
            String type = parts[2];

            if (type.equals("IN")) {
                inTime.put(carNumber, time);
            } else {
                int startTime = inTime.remove(carNumber);
                int parkedDuration = time - startTime;

                totalParkingTime.put(carNumber, totalParkingTime.getOrDefault(carNumber, 0) + parkedDuration);
            }
        }

        for (Map.Entry<String, Integer> entry : inTime.entrySet()) {
            String carNumber = entry.getKey();
            int startTime = entry.getValue();
            int parkedDuration = 1439 - startTime;

            totalParkingTime.put(carNumber, totalParkingTime.getOrDefault(carNumber, 0) + parkedDuration);
        }

        List<String> sortedCarNumbers = new ArrayList<>(totalParkingTime.keySet());
        Collections.sort(sortedCarNumbers);

        int[] resultFees = new int[sortedCarNumbers.size()];
        for (int i = 0; i < sortedCarNumbers.size(); i++) {
            String carNumber = sortedCarNumbers.get(i);
            int totalMinutes = totalParkingTime.get(carNumber);
            int currentFee = basicFee;

            if (totalMinutes > basicTime) {
                int extraMinutes = totalMinutes - basicTime;
                currentFee += (int) Math.ceil((double) extraMinutes / unitTime) * unitFee;
            }
            resultFees[i] = currentFee;
        }

        return resultFees;
    }

    private int parseTimeToMinutes(String timeStr) {
        String[] parts = timeStr.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}