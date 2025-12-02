import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] arr = new int[3];
        int idx = 0;
        
        for(int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            if(Character.isDigit(c)) {
                if(c == '1' && dartResult.charAt(i + 1) == '0') {
                    arr[idx++] = 10;
                    i++;
                } else {
                    arr[idx++] = c - '0';
                }
            } else if (c == 'D') {
                arr[idx - 1] = (int) Math.pow(arr[idx - 1], 2);
            } else if (c == 'T') {
                arr[idx - 1] = (int) Math.pow(arr[idx - 1], 3);
            } else if (c == '*') {
                if(idx >= 2) {
                    arr[idx - 2] *= 2;
                }
                arr[idx - 1] *= 2;
            } else if (c == '#') {
                arr[idx - 1] *= -1;
            }
        }
        
        return arr[0] + arr[1] + arr[2];
    }
}