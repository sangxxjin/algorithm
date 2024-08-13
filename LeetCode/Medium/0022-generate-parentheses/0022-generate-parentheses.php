class Solution {

    /**
     * @param Integer $n
     * @return String[]
     * 원래 대부분의 괄호문제의 경우 stack은 사용하는데 몇개의 쌍을 문제가 아님으로 백트래킹 사용
     */
    function generateParenthesis($n) {
        $result = [];
        $this->backtrack($result, "", $n, $n);
        return $result;
    }

    private function backtrack(&$result, $current, $left, $right) {
        if ($left == 0 && $right == 0) {
            $result[] = $current;
            return;
        }
        if ($left > 0) {
            $this->backtrack($result, $current . "(", $left - 1, $right);
        }
        if ($right > $left) {
            $this->backtrack($result, $current . ")", $left, $right - 1);
        }
    }
}
