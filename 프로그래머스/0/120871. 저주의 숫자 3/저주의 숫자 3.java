class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1. n이 1000이하 -> 완전 탐색
        for(int i = 1; i <= n; i++) {
            answer++;
            
            // 31, 32, 33, ... 3이 없어질 때까지 올려
            while(answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
            }
        }
        
        return answer;
    }
}