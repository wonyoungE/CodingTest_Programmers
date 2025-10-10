import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0) {
            return cities.length * 5;
        }
        int answer = 0;
        ArrayList<String> cache = new ArrayList<>();
        
        for(String city : cities) {
            String lower = city.toLowerCase();
            
            if(cache.contains(lower)) {
                cache.remove(lower);
                answer += 1;
            } else {
                if(cache.size() == cacheSize) {
                    cache.remove(0);
                }
                answer += 5;
            }
            cache.add(lower);
        }
        
        return answer;
    }
}