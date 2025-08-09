class Solution {
    public int solution(int n) {
        int cnt = Integer.bitCount(n);
        
        while(true) {
            n++;
            int next_cnt = Integer.bitCount(n);
            if(next_cnt == cnt) return n;
        }
    }
}