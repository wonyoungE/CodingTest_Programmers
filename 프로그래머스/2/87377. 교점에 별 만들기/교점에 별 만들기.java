import java.util.*;

class Solution {
    public String[] solution(int[][] line) {
        String[] answer = {};
        HashSet<String> set = new HashSet<>();
        long max_x = Long.MIN_VALUE, max_y = Long.MIN_VALUE;
        long min_x = Long.MAX_VALUE, min_y = Long.MAX_VALUE;
        
        for(int i = 0; i < line.length-1; i++) {
            long a = line[i][0], b = line[i][1], e = line[i][2];
            
            for(int j = i + 1; j < line.length; j++) {
                long c = line[j][0], d = line[j][1], f = line[j][2];
                
                long adbc = a * d - b * c;
                if(adbc == 0) continue; // 평행
                
                // 자바에서 long/long은 정수
                long bfed = b * f - e * d;
                long ecaf = e * c - a * f;
                
                // 정수 확인
                if(bfed % adbc != 0 || ecaf % adbc != 0) {
                    continue;
                }
                
                // 둘 다 정수면
                long x = bfed / adbc;
                long y = ecaf / adbc;
                
                set.add(x + ", " + y);
                    
                min_x = Math.min(min_x, x);
                min_y = Math.min(min_y, y);
                max_x = Math.max(max_x, x);
                max_y = Math.max(max_y, y);
            }
        }
        
        long height = max_y - min_y + 1;
        long width = max_x - min_x + 1;
        answer = new String[(int)height];
        
        char[][] grid = new char[(int)height][(int)width];
        for(char[] row : grid) {
            Arrays.fill(row, '.');
        }
        
        for(String point : set) {
            String[] split = point.split(", ");
            long x = Long.parseLong(split[0]);
            long y = Long.parseLong(split[1]);
            
            grid[(int)(max_y - y)][(int)(x - min_x)] = '*';
        }
        
        for(int i = 0; i < (int)height; i++) {
            answer[i] = new String(grid[i]);
        }
        
        return answer;
    }
}