class Solution {

    /**
     * @param Integer[] $candidates
     * @param Integer $target
     * @return Integer[][]
     */
    function combinationSum($candidates, $target) {
        $result = [];
        $this->backtrack($candidates, $target, [], 0, $result);
        return $result;
    }
    
    private function backtrack($candidates, $target, $current, $start, &$result) {
        if ($target == 0) {
            $result[] = $current;
            return;
        }
        
        for ($i = $start; $i < count($candidates); $i++) {
            if ($candidates[$i] <= $target) {
                $this->backtrack($candidates, $target - $candidates[$i], array_merge($current, [$candidates[$i]]), $i, $result);
            }
        }
    }
}
