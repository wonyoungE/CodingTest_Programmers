import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;        
        int n = citations.length;
        
        Arrays.sort(citations);
        
        for(int h = n; h > 0; h--) {
            int x = 0;
            int y = 0;
            
            for(int i = 0; i < citations.length; i++) {
                if(citations[i] >= h) x++;
            }
            
            if(x >= h) {
                return h;
            }
        }
        
        return answer;
    }
}