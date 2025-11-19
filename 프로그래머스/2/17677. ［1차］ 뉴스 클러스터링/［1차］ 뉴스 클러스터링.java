import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        Map<String, int[]> map = new HashMap<>();
        for(int i = 0; i < str1.length()-1; i++) {
            String sub = str1.substring(i, i+2);
            
            if(!sub.matches("[a-z]{2}")) {
                continue;
            }
            
            int[] tmp = map.getOrDefault(sub, new int[]{0, 0});
            tmp[0]++;
            
            map.put(sub, tmp);
        }
        
        for(int i = 0; i < str2.length()-1; i++) {
            String sub = str2.substring(i, i+2);
            
            if(!sub.matches("[a-z]{2}")) {
                continue;
            }
            
            int[] tmp = map.getOrDefault(sub, new int[]{0, 0});
            tmp[1]++;
            
            map.put(sub, tmp);
        }
        
        if(map.size() == 0) return 65536;
        
        int hap = 0;
        int gyo = 0;
        for(String key : map.keySet()) {
            hap += Math.max(map.get(key)[0], map.get(key)[1]);
            gyo += Math.min(map.get(key)[0], map.get(key)[1]);
        }

        answer = (int)((double)gyo / (double)hap * (double)65536);
        
        return answer;
    }
}