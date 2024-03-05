class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int sub = 0;
        int minLength = Math.min(my_string.length(), is_prefix.length());

        for (int i = 0; i < minLength; i++) {
            if (is_prefix.charAt(i) == my_string.charAt(i)) {
                sub++;
            }
        }

        if (sub == is_prefix.length()) {
            answer = 1;
        }

        return answer;
    }
}
