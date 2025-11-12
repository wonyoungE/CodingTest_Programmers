class Solution {
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        
        // A->B, B->C 면 A->C 연결
        // 이어서 파고들어가므로 dfs
        
        for(int i = 0; i < computers.length; i++) {
            // 다른 컴퓨터와 연결되지 않은 경우 -> 그 컴퓨터 자체로 네트워크 연결
            if(!visited[i]) {
                answer++;
                visited[i] = true;
                dfs(i, computers);
            }
        }
        
        return answer;
    }
    
    void dfs(int num, int[][] computers) {
        for(int i = 0; i < computers.length; i++) {
            if(num != i && !visited[i] && computers[num][i] == 1) {
                visited[i] = true;
                dfs(i, computers);
            }
        }
    }
}