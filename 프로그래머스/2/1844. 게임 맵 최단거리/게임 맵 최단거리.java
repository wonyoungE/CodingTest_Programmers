import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        // 최단 거리 문제 -> bfs
        // 큐 + 2차원 배열
        int[][] visited = new int[n][m];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        
        // 시작점 방문 처리
        visited[0][0] = 1;
        
        while(!queue.isEmpty()) {
            // 현재 위치
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            
            // 상, 하, 좌, 우 확인
            int[] dx = {0, 0, -1, 1};
            int[] dy = {-1, 1, 0, 0};
            
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx != -1 && nx != n && ny != -1 && ny != m) {
                    // 갈 수 있고, 방문한 곳인지 여부(이미 방문했다면 그 자리는 해당 거리가 최소임)
                    if(maps[nx][ny] == 1 && visited[nx][ny] == 0) {
                        queue.add(new int[]{nx, ny});
                        visited[nx][ny] = visited[x][y] + 1;
                    }
                }
            }
        }
        
        return visited[n-1][m-1] == 0 ? -1 : visited[n-1][m-1];
    }
}