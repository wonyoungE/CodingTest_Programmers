import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        String[] b_split = before.split("");
        String[] a_split = after.split("");
        
        Arrays.sort(b_split);
        Arrays.sort(a_split);
        
        for(int i = 0; i < b_split.length; i++) {
            if(!b_split[i].equals(a_split[i])) {
                return 0;
            }
        }
        
        return 1;
    }
}