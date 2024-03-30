class Solution {
    public int[] solution(int[] numbers, String direction) {
        // 배열의 길이가 0이거나 1인 경우, 회전시켜도 변하지 않으므로 그대로 반환
        if(numbers.length <= 1) {
            return numbers;
        }

        int[] answer = new int[numbers.length];
        
        if("left".equals(direction)) {
            System.arraycopy(numbers, 1, answer, 0, numbers.length - 1);
            answer[numbers.length - 1] = numbers[0];
        } else if("right".equals(direction)) {
            System.arraycopy(numbers, 0, answer, 1, numbers.length - 1);
            answer[0] = numbers[numbers.length - 1];
        }
        
        return answer;
    }
}
