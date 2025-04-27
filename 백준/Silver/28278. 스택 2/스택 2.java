import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int order = scanner.nextInt();
			if (order == 1) stack.push(scanner.nextInt());
			if (order == 2) {
				sb.append(stack.isEmpty() ? "-1\n" : stack.pop() + "\n");
			}
			if (order == 3) sb.append(stack.size()).append("\n");
			if (order == 4) sb.append(stack.isEmpty() ? "1\n" : "0\n");
			if (order == 5) {
				sb.append(stack.isEmpty() ? "-1\n" : stack.peek() + "\n");
			}
		}
		System.out.println(sb);
	}
}
