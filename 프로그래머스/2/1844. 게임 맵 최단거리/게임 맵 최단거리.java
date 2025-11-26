import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        
        // BFS
        // 최대한 빨리 도착 = 최단 거리 = bfs
        // 방문한 곳, 해당 위치의 값이 그 위치까지의 최단 거리
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
            
            // 현재 위치에서 상 하 좌 우 볼 것
            int[] dx = {0, 0, -1, 1};
            int[] dy = {-1, 1, 0, 0};
            
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                // 범위 체크
                if(nx != -1 && nx != n && ny != -1 && ny != m) {
                    // 갈 수 있고, 방문한 곳인지 여부 확인(이미 방문했으면 방문한 숫자가 최소일 것)
                    // 왜냐면 이제 가면 한 번 더 거쳐가는 거기 때문에
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