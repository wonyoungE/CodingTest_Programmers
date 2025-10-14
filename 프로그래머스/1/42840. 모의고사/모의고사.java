import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] supoja1 = {1, 2, 3, 4, 5};
        int[] supoja2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supoja3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = {0, 0, 0};
        
        for(int i = 0; i < answers.length; i++) {
            if(supoja1[i % supoja1.length] == answers[i]) scores[0]++;
            if(supoja2[i % supoja2.length] == answers[i]) scores[1]++;
            if(supoja3[i % supoja3.length] == answers[i]) scores[2]++;
        }
        
        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] == max) {
                list.add(i+1);
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}