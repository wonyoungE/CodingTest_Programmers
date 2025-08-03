class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String num = Integer.toString(n, k);
        String[] split = num.split("0");
            
        for(String s : split) {
            if(s.equals("")) continue;
            
            long x = Long.parseLong(s);
            // 10진법으로 보았을 때 소수
            if(isPrime(x)) answer++;
        }
            
        return answer;
    }
    
    private boolean isPrime(long num) {
        if(num < 2) return false;
        for(long i = 2; i * i <= num; i++) {
            if(num % i == 0) return false;
        }
        
        return true;
    }
}