import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < numbers.length-1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        answer = new int[set.size()];
        int idx = 0;
        
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()) {
            answer[idx++] = iter.next();
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}