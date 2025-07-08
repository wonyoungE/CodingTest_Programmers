class Solution {
    public int[] solution(String[] wallpaper) {
        int x_min = 50, y_min = 50, x_max = 0, y_max = 0;
        
        for(int i = 0; i < wallpaper.length; i++) {
            for(int j = 0; j < wallpaper[i].length(); j++) {
                char file = wallpaper[i].charAt(j);
                if(file == '#') {
                    if(x_min > i) x_min = i;
                    if(y_min > j) y_min = j;
                    if(x_max < i) x_max = i;
                    if(y_max < j) y_max = j;
                }
            }
        }
        return new int[]{x_min, y_min, x_max+1, y_max+1};
    }
}