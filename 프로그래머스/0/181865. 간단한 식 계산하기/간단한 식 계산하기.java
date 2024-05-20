class Solution {
    public int solution(String binomial) {
		String[] answer = binomial.split(" ");
		int a = Integer.parseInt(answer[0]);
		int b = Integer.parseInt(answer[2]);
		char op = answer[1].charAt(0);

		switch (op) {
			case '+':
				return a + b;
			case '-':
				return a - b;
			case '*':
				return a * b;
			default:
				throw new IllegalArgumentException("Invalid operator: " + op);
		}
	}
}