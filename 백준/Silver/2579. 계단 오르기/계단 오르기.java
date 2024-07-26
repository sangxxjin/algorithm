import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter outputWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int numSteps = Integer.parseInt(inputReader.readLine());
        int[] stairs = new int[numSteps + 1];
        for (int step = 1; step <= numSteps; step++) {
            stairs[step] = Integer.parseInt(inputReader.readLine());
        }
        int[] dp = new int[numSteps + 1];
        dp[1] = stairs[1];
        if (numSteps >= 2) {
            dp[2] = stairs[1] + stairs[2];
        }
        for (int step = 3; step <= numSteps; step++) {
            dp[step] = Math.max(dp[step - 2], dp[step - 3] + stairs[step - 1]) + stairs[step];
        }
        outputWriter.write(dp[numSteps] + "\n");
        outputWriter.flush();
        outputWriter.close();
        inputReader.close();
    }
}