class Solution {
    int answer = 0;
    int[][] dungeons;
    boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        this.dungeons = dungeons;
        this.visited = new boolean[dungeons.length];
        
        // 조합 문제, 순서 중요 => 재귀로 해결
        // 방문한 던전인지 확인해야 함
        // 현재 피로도, 방문한 던전 수
        dfs(k, 0);
        
        return answer;
    }
    
    void dfs(int k, int count) {
        answer = Math.max(answer, count);
        
        // 다음 던전 탐색
        for(int i = 0; i < dungeons.length; i++) {
            // 만약 방문 안했고, 들어갈 수 있으면
            if(!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                
                // 다음 던전
                dfs(k - dungeons[i][1], count + 1);
                
                // 재귀 끝나면 다음 던전ㄱㄱ
                visited[i] = false;
            }
        }
    }
}