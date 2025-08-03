import java.util.*;

class Solution {
    public int solution(int[] elements) {
        // 연속 수열의 합을 저장할 set
        Set<Integer> set = new HashSet<>();
        
        // 길이가 i인 연속 부분 수열
        // 0번 인덱스부터 elements[i-1] 인덱스까지
        for(int i = 0; i < elements.length; i++) {
            // 길이가 1, 2, 3, 4, 5, ... elements.length인 부분 연속 수열
            for(int j = 1; j <= elements.length; j++) {
                int sum = 0;
                // 나머지 이용하기
                for(int k = i; k < i + j; k++) {
                    sum += elements[k % elements.length];
                }
                set.add(sum);
            }
        }
        
        return set.size();
    }
}