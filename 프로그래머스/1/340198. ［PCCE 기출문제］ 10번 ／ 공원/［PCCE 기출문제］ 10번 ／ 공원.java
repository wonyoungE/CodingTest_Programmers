import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = 0;
        
        Arrays.sort(mats);
        
        for(int i = mats.length-1; i >= 0; i--) {
            int mat_len = mats[i], w = park.length, h = park[0].length;
            for(int j = 0; j <= w - mat_len; j++) {
                for(int k = 0; k <= h - mat_len; k++) {
                    boolean flag = true;
                    for(int x = j; x < j + mat_len; x++) {
                        for(int y = k; y < k + mat_len; y++) {
                            if(!park[x][y].equals("-1")) {
                                flag = false;
                                break;
                            }
                        }
                        if(flag == false) {
                            break;
                        }
                    }
                    if(flag == true) {
                        return mat_len;
                    }
                }
            }
        }
        
        return -1;
    }
}