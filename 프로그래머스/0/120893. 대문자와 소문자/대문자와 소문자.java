class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char sub = my_string.charAt(i);
            if (Character.isUpperCase(sub)){
                answer.append(Character.toLowerCase(sub));
            }
            else answer.append(Character.toUpperCase(sub));
        }
        return answer.toString();
    }
}