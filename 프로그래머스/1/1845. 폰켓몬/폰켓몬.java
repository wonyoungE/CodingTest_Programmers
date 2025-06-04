import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        int myPonkemon = nums.length / 2;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int n : nums) {
            map.put(n, 1);
        }
        
        return myPonkemon > map.size() ? map.size() : myPonkemon;
    }
}