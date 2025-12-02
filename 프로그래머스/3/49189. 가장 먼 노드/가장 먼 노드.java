import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        // 리스트의 배열
        List<Integer>[] list = new ArrayList[n + 1];
        
        // 아이디어
        // 최단 -> bfs -> Queue
        // 방문하는 순간 그 방문이 최단 거리(간선 갯수)
        // 간선은 양방향 -> 인접 노드 리스트 만들기
        for(int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        
        for(int[] e : edge) {
            int start = e[0];
            int end = e[1];
            
            // 양방향 간선 추가
            list[start].add(end);
            list[end].add(start);
        }
        
        Queue<Integer> queue = new LinkedList<>();
        int[] visited = new int[n + 1];
        
        // 1번 노드부터 시작
        queue.add(1);
        visited[1] = 1;
        
        // 각 노드 별 최단 거리 구하기
        while(!queue.isEmpty()) {
            int start = queue.poll();
            
            for(int next : list[start]) {
                if(visited[next] == 0) {
                    visited[next] = visited[start] + 1;
                    queue.add(next);
                }
            }
        }
        
        Arrays.sort(visited);
        int max = visited[n];
        int idx = n;
        
        while(visited[n] == max) {
            answer++;
            n--;
        }
        
        return answer;
    }
}