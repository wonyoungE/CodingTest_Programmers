import java.util.*;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length-1; i++) {
            arr[i+1] = arr[i+1] * arr[i] / gcd(arr[i+1], arr[i]);
        }
        
        return arr[arr.length-1];
    }
    
    // 최대 공약수 구하는 함수
    private int gcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}