class Solution {
    public int solution(int n) {
        // 이진 변환 메서드 -> Integer.toString(숫자, 진법)
        String bin = Integer.toString(n, 2);
        int n_cnt = 0;
        for(int i = 0; i < bin.length(); i++) {
            char c = bin.charAt(i);
            if(c == '1') n_cnt++;
        }
        
        while(true) {
            n++;
            String next = Integer.toString(n, 2);
            int next_cnt = 0;
            for(int i = 0; i < next.length(); i++) {
                char c = next.charAt(i);
                if(c == '1') next_cnt++;
            }
            if(next_cnt == n_cnt) return n;
        }
    }
}