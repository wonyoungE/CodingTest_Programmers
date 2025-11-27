import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i = 0; i < prices.length; i++) {
            Stack<Integer> stack = new Stack<>();
            int stock = prices[i];
            for(int j = i; j < prices.length-1; j++) {
                if(stock <= prices[j]) {
                    stack.push(prices[j]);
                } else {
                    break;
                }
            }
            answer[i] = stack.size();
        }
        
        return answer;
    }
}