import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left) + 1];
        
        // {i % n + 1, i / n + 1}
        int idx = 0;
        for(long i = left; i <= right; i++) {
            // 행
            int row = (int)(i / n);
            // 열
            int column = (int)(i % n);
            int max = Math.max(row, column);
            answer[idx++] = max + 1;
        }
        
        return answer;
    }
}