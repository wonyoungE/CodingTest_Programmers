import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2).replace("},{", "-");     
        String[] split = s.split("-");
        
        Arrays.sort(split, (s1, s2) -> s1.length() - s2.length());
        
        ArrayList<String> list = new ArrayList<>();
        
        for(String set : split) {
            String[] elements = set.split(",");
            
            for(String element : elements) {
                if(!list.contains(element)) {
                    list.add(element);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(list.get(i));
        }
        
        return answer;
    }
}