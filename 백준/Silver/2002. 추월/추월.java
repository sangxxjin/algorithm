import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCars = Integer.parseInt(bufferedReader.readLine());
        Queue<String> enterQueue = new LinkedList<>();
        for (int i = 0; i < numberOfCars; i++) {
            enterQueue.add(bufferedReader.readLine());
        }
        Queue<String> exitQueue = new LinkedList<>();
        for (int i = 0; i < numberOfCars; i++) {
            exitQueue.add(bufferedReader.readLine());
        }
        int mismatchCount = 0;
        while (!exitQueue.isEmpty()) {
            String exitingCar = exitQueue.poll();
            if (!enterQueue.peek().equals(exitingCar)) {
                mismatchCount++;
                enterQueue.remove(exitingCar);
            } else {
                enterQueue.poll();
            }
        }
        System.out.println(mismatchCount);
        bufferedReader.close();
    }
}
