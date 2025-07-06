import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        // 0개, 1개 번호 일치 -> 6등
        // 최고 순위 = 알아볼 수 있는 수가 일치 + 알아볼 수 없는 수가 모두 일치
        // 최저 순위 = 알아볼 수 있는 수만 일치
        Map<Integer, Integer> map = new HashMap<>();
        map.put(6, 1); map.put(5, 2); map.put(4, 3); map.put(3, 4);
        map.put(2, 5); map.put(1, 6); map.put(0, 6);
        int correct = 0, zero = 0;
        
        for(int num : lottos) {
            if(num == 0) {
                zero++;
                continue;
            }
            for(int i = 0; i < win_nums.length; i++) {
                if(win_nums[i] == num) {
                    correct++;
                    break;
                }
            }
        }
        
        answer[0] = map.get(correct + zero);
        answer[1] = map.get(correct);
        
        return answer;
    }
}