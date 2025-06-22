import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            return new int[]{-1};
        }
        int[] copy_arr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy_arr);
        int min = copy_arr[0];
        
        int[] answer = new int[arr.length - 1];
        int idx = 0;
        for(int a : arr) {
            if(a != min) {
                answer[idx++] = a;
            }
        }
        
        return answer;
    }
}