import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        // 구명 보트를 최대한 적게 사용
        // 제일 무거운 사람 + 남은 무게 중에서 태울 수 있는 사람 중에 제일 가벼운 사람
        // 포인터 두 개 전략
        Arrays.sort(people);
        
        int left = 0;
        int right = people.length - 1;
        
        // 교차되기 전까지
        while(left <= right) {
            if(people[left] + people[right] <= limit) {
                left++;
                right--;
            } else {
                // 제일 무거운 사람만 태워보내기
                right--;
            }
            answer++;
        }
        
        return answer;
    }
}