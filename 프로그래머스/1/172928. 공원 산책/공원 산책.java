import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        Map<String, Integer> direc_map = new HashMap<>();
        direc_map.put("N", 0);
        direc_map.put("S", 1);
        direc_map.put("W", 2);
        direc_map.put("E", 3);
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int h = park.length, w = park[0].length();
        int x = 0, y = 0;
        
        bp: for(int i = 0; i < h; i++) {
              for(int j = 0; j < w; j++) {
                  if(park[i].charAt(j) == 'S') {
                      x = i;
                      y = j;
                      break bp;
                }
            }
        }
        
        for(String route : routes) {
            String[] split = route.split(" ");
            int direc = direc_map.get(split[0]);
            int block = Integer.parseInt(split[1]);
            boolean isAvailable = true;
            
            int nx = x + dx[direc] * block;
            int ny = y + dy[direc] * block;
            
            if(nx < 0 || nx >= h || ny < 0 || ny >= w) {
                isAvailable = false;
                continue;
            }
            
            for(int i = 1; i <= block; i++) {
                int nx_check = x + dx[direc] * i;
                int ny_check = y + dy[direc] * i;
                if(park[nx_check].charAt(ny_check) == 'X') {
                    isAvailable = false;
                    break;
                }
            }
            
            if(isAvailable) {
                x = nx;
                y = ny;
            }
        }
        
        return new int[]{x, y};
    }
}