class Solution {
    static String[] vowels = {"A", "E", "I", "O", "U"};
    static int index = 0;
    static int answer = 0;
    static boolean found = false;

    public int solution(String word) {
        dfs("", word);
        return answer;
    }

    private void dfs(String current, String target) {
        if (current.equals(target)) {
            found = true;
            answer = index;
            return;
        }
        if (current.length() == 5) return;

        for (int i = 0; i < vowels.length; i++) {
            if (found) return;
            index++;
            dfs(current + vowels[i], target);
        }
    }
}
