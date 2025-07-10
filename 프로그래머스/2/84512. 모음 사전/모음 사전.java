class Solution {
    int count = 0; 
    int answer = 0;
    static String[] aeiou = {"A", "E", "I", "O", "U"};
    
    public int solution(String word) {
        dfs("", word);
        return answer;
    }
    
    private void dfs(String cur, String target) {
        if(cur.length() > 5) return;
        
        count++;
        
        if(cur.equals(target)) {
            answer = count - 1;
            return;
        }
        
        for(int i = 0; i < 5; i++) {
            dfs(cur + aeiou[i], target);
        }
    }
}