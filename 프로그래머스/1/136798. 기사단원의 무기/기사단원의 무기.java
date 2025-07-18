import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <= number; i++) {
            int divisorCnt = 0;
            for(int j = 1; j * j <= i; j++) {
                if(i % j == 0) {
                    divisorCnt++;
                    if(j != i / j) {
                        divisorCnt++;
                    }
                }
            }
            if(divisorCnt > limit) {
                answer += power;
            } else {
                answer += divisorCnt;
            }
        }
        
        return answer;
    }
}