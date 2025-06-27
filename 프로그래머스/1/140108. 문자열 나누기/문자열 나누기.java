class Solution {
    public int solution(String s) {
        int answer = 0;
        int x_cnt = 0, nx_cnt = 0;
        char x = s.charAt(0);
        
        for(int i = 0; i < s.length(); i++) {
            if(x_cnt == 0) {
                x = s.charAt(i);
                x_cnt = 1;
                nx_cnt = 0;
                continue;
            }
            
            if(x == s.charAt(i)) {
                x_cnt++;
            } else {
                nx_cnt++;
            }
            
            if(x_cnt == nx_cnt) {
                answer++;
                x_cnt = 0;
                nx_cnt = 0;
            }
        }
        if(x_cnt != 0) {
            answer++;
        }
        
        return answer;
    }
}