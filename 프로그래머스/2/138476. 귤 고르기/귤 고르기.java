import java.util.Arrays;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Arrays.sort(tangerine);
        int[] count = new int[tangerine[tangerine.length-1]];
        
        for(int t : tangerine) {
            count[t-1]++;
        }
        
        Arrays.sort(count);
        for(int i = count.length-1; i >= 0; i--) {
            k -= count[i];
            answer++;
            if(k <= 0) return answer;
        }
        
        return answer;
    }
}