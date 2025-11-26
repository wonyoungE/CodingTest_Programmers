import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		// bfs -> Queue
		// 방문한 곳인지 확인
		int[] visited = new int[100001];
		// 위치와 해당 위치까지의 이동 초 수
		Queue<int[]> queue = new LinkedList();
		
		// 초기화
		// 수빈이의 현재 위치
		visited[n] = 1; // 방문 처리
		queue.add(new int[]{n, 0});
		
		while(!queue.isEmpty()) {
			int[] current = queue.poll();
			int loc = current[0];
			int sec = current[1];
			
			if(loc == k) {
				System.out.println(sec);
				break;
			}
			
			int nextSec = sec + 1;
			
			// 현재 위치에서 갈 수 있는 곳 -> x-1, x+1, 2x
			int[] nextLoc = {loc - 1, loc + 1, loc * 2};
			
			for(int next : nextLoc) {
				if(next >= 0 && next <= 100000) {
					if(visited[next] != 1) {
						visited[next] = 1;
						queue.add(new int[] {next, nextSec});
					}
				}
			}
		}
	}
}
