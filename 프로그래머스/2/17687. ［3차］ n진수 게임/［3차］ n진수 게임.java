class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < t * m; i++) {
            String num = Integer.toString(i, n);
            sb.append(num.toUpperCase());
        }
        
        String str = sb.toString();
        
        for(int i = p-1; i < str.length(); i+=m) {
            if(answer.length() == t) {
                return answer.toString();
            }
            answer.append(str.charAt(i));
        }
    
        return answer.toString();
    }
}