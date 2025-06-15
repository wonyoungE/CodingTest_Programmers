import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);
        
        int e = map.get(ext), s = map.get(sort_by);
        
        for(int[] d : data) {
            if(d[e] < val_ext) {
                list.add(d);
            }
        }
        
        // 정렬
        int[][] answer = new int[list.size()][];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        
        int[] tmp = new int[data[0].length];
        for(int i = 0; i < answer.length - 1; i++) {
            for(int j = i; j < answer.length; j++) {
                if(answer[i][s] > answer[j][s]) {
                    tmp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tmp;
                }
            }
        }        
        
        return answer;
    }
}