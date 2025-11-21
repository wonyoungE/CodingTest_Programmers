class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int answer = n * n;
       
        int[][] new_board = new int[n][n];
        int[] dx = new int[]{-1, 0, 1};
        int[] dy = new int[]{-1, 0, 1};
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 1) {
                    for(int x = 0; x < dx.length; x++) {
                        int nx = i + dx[x];
                        if(nx < 0 || nx >= n) continue;
                        
                        for(int y = 0; y < dy.length; y++) {
                            int ny = j + dy[y];
                            if(ny < 0 || ny >= n) continue;
                            
                            if(new_board[nx][ny] == -1) continue;
                            
                            new_board[nx][ny] = -1;
                            answer--;
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}