import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        
        for(String term : terms) {
            map.put(term.split(" ")[0], Integer.parseInt(term.split(" ")[1]) * 28);
        }
        
        for(int i = 0; i < privacies.length; i++) {
            String start = privacies[i].split(" ")[0];
            String type = privacies[i].split(" ")[1];
            
            if(toDate(today) > toDate(start) + map.get(type) - 1) {
                list.add(i+1);
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
    
    private int toDate(String date) {
        return Integer.parseInt(date.split("\\.")[0]) * 12 * 28 
            + Integer.parseInt(date.split("\\.")[1]) * 28 
            + Integer.parseInt(date.split("\\.")[2]);
    }
}