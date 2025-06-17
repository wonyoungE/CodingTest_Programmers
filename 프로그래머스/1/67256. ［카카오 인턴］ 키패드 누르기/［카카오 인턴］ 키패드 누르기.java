import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        hand = hand.substring(0, 1).toUpperCase();
        
        Map<Integer, int[]> map = new HashMap<>();
        int idx = 1;
        map.put(0, new int[]{3,1});
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                map.put(idx++, new int[]{i,j});
            }
        }
        
        int[] r_loc = {3,0}, l_loc = {3, 2};
        
        for(int n : numbers) {
            int[] n_loc = map.get(n);
            
            if(n % 3 == 1) {
                sb.append("L");
                l_loc = n_loc;
            } else if(n % 3 == 0 && n != 0) {
                sb.append("R");
                r_loc = n_loc;
            } else {
                int r_gap = Math.abs(r_loc[0] - n_loc[0]) + Math.abs(r_loc[1] - n_loc[1]);
                int l_gap = Math.abs(l_loc[0] - n_loc[0]) + Math.abs(l_loc[1] - n_loc[1]);
                if(r_gap == l_gap) {
                    sb.append(hand);
                    if(hand.equals("L")) {
                        l_loc = n_loc;
                    } else {
                        r_loc = n_loc;
                    }
                } else if(r_gap > l_gap) {
                    sb.append("L");
                    l_loc = n_loc;
                } else {
                    sb.append("R");
                    r_loc = n_loc;
                }
            }
        }
        return sb.toString();
    }
}