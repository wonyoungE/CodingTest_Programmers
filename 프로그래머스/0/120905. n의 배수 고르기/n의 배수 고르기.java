import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : numlist) {
            if(i % n == 0) {
                list.add(i);
            }
        }
        
        int[] answer = new int[list.size()];
        int idx = 0;
        
        for(int i : list) {
            answer[idx++] = i;
        }
        
        return answer;
    }
}