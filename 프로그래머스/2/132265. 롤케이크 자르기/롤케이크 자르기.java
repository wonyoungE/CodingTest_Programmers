import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer, Integer> hyung = new HashMap<>();
        HashMap<Integer, Integer> dongsaeng = new HashMap<>();
        
        for(int i = 0; i < topping.length; i++) {
            dongsaeng.put(topping[i], dongsaeng.getOrDefault(topping[i], 0) + 1);
        }
        
        for(int i = 0; i < topping.length; i++) {
            int ingredient = topping[i];
            
            hyung.put(ingredient, hyung.getOrDefault(ingredient, 0) + 1);
            
            if(dongsaeng.get(ingredient) == 1) {
                dongsaeng.remove(ingredient);
            } else {
                dongsaeng.put(ingredient, dongsaeng.get(ingredient) - 1);
            }
            
            if(hyung.size() == dongsaeng.size()) {
                answer++;
            }
        }
        
        return answer;
    }
}