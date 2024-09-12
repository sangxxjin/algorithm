import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String[]> courseRecords = getCourseRecords();
        Map<String, Double> gradePointMap = createGradePointMap();

        double totalGradePoints = 0;
        double totalCredits = 0;
        for (String[] course : courseRecords) {
            String grade = course[2];
            if (grade.equals("P")) continue;

            double credits = Double.parseDouble(course[1]);
            totalCredits += credits;
            totalGradePoints += gradePointMap.get(grade) * credits;
        }

        double gpa = calculateGPA(totalGradePoints, totalCredits);
        System.out.println(gpa);
    }

    private static List<String[]> getCourseRecords() {
        List<String[]> courseRecords = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 20; i++) {
                courseRecords.add(sc.nextLine().split(" "));
            }
        }
        return courseRecords;
    }

    private static Map<String, Double> createGradePointMap() {
        Map<String, Double> gradePointMap = new HashMap<>();
        gradePointMap.put("A+", 4.5);
        gradePointMap.put("A0", 4.0);
        gradePointMap.put("B+", 3.5);
        gradePointMap.put("B0", 3.0);
        gradePointMap.put("C+", 2.5);
        gradePointMap.put("C0", 2.0);
        gradePointMap.put("D+", 1.5);
        gradePointMap.put("D0", 1.0);
        gradePointMap.put("F", 0.0);
        return gradePointMap;
    }

    private static double calculateGPA(double totalGradePoints, double totalCredits) {
        return totalGradePoints / totalCredits;
    }
}
