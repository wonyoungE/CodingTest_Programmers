class Solution {
    public int solution(int balls, int share) {
        double a = 1;
        double b = 1;
        
        for(int i = balls; i > balls - share; i--) {
            a *= i;
        }
        
        for(int i = 1; i <= share; i++) {
            b *= i;
        }
        
        return (int)Math.round(a/b);
    }
}