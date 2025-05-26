import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        
        for(int i : arr) {
            if(i % divisor == 0) {
                list.add(i);
            }
        }
        
        if(list.isEmpty()) {
            return new int[] {-1};
        } else {
            Collections.sort(list);
            answer = list.stream().mapToInt(i->i).toArray();
        }
        
        return answer;
    }
}