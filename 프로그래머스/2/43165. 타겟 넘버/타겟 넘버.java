class Solution {
    int answer = 0;
    int target;
    int[] numbers;
    
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        
        dfs(0, 0);
        
        return answer;
    }
    
    // 누적할 변수는 어디에?
    // depth가 몇 번째인지
    void dfs(int sum, int turn) {
        if(turn == numbers.length) {
            if(sum == target) answer++;
            return;
        }
        // + 
        dfs(sum + numbers[turn], turn + 1);
        // -
        dfs(sum - numbers[turn], turn + 1);
    }
}