import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Integer[] sortedArr = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(sortedArr, Collections.reverseOrder());
        
        for(int i = 0; i < emergency.length; i++) {
            for(int j = 0; j < sortedArr.length; j++) {
                if(emergency[i] == sortedArr[j]) {
                    answer[i] = j + 1;
                }
            }
        }
        
        return answer;
    }
}