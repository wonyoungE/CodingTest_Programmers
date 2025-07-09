class Solution {
    int answer = 0;
    int[] numbers;
    int target;
    
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        dfs(0, 0);
        
        return answer;
    }
    
    void dfs(int idx, int sum) {
        if(idx == numbers.length) {
            if(sum == target) answer++;
            return;
        }
        
        dfs(idx + 1, sum + numbers[idx]);
        dfs(idx + 1, sum - numbers[idx]);
    }
    
}