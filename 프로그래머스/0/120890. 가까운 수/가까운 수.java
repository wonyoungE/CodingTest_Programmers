import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        for(int a : array) {
            list.add(a);
        }
        
        Collections.sort(list);
        
        int idx = list.indexOf(n);
        
        if(idx == 0) {
            return list.get(idx + 1);
        } else if(idx == list.size()-1) {
            return list.get(idx - 1);
        }
        
        int gap1 = n - list.get(idx-1);
        int gap2 = list.get(idx+1) - n;
        
        return gap2 > gap1 || gap2 == gap1 ? list.get(idx - 1) : list.get(idx + 1);
    }
}