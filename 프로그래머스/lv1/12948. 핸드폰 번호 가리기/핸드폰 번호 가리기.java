class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] arr = new char[phone_number.length()];
        for (int i = 0; i < phone_number.length(); i++) {
            arr[i]=phone_number.charAt(i);
        }
        for (int i = 0; i < arr.length-4; i++) {
            arr[i]='*';
        }
        for (int i = 0; i < arr.length; i++) {
            answer+=arr[i];
        }
        return answer;
    }
}