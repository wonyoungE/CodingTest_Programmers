class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        
        int h = n % w == 0 ? n / w : n / w + 1;
        int num_h = num % w == 0 ? num / w : num / w + 1;
        
        if(h % 2 == num_h % 2) {    // 방향이 동일할 경우
            answer = (h - num_h) * w + num > n ? h - num_h : h - num_h + 1;
        } else {    // 이동 방향이 다를 경우
            int num_idx = num % w == 0 ? w : num % w;
            answer = (h - num_h) * w + (w - num_idx + 1) > n ? h - num_h : h - num_h + 1;
        }
        
        return answer;
    }
}