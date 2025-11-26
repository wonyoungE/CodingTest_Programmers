class Solution {
    public int solution(int n, int a, int b) {
        int answer = 1;
        int x = Math.min(a, b);
        int y = Math.max(a, b);
        
        // 2^1 이상 2^20 이하인 자연수
        // 시간복잡도?
        
        // a + 1 == b이고 a는 홀수, b는 짝수일 경우
        while(true) {
            if(x + 1 == y && x % 2 == 1 && y % 2 == 0) {
                break;
            }
            
            x = (int) Math.ceil(x / 2.0);
            y = (int) Math.ceil(y / 2.0);
            answer++;
        }
        
        return answer;
    }
}