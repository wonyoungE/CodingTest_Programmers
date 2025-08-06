class Solution {
    public int[] solution(String[] wallpaper) {
        int min_x = Integer.MAX_VALUE;
        int min_y = Integer.MAX_VALUE;
        int max_x = Integer.MIN_VALUE;
        int max_y = Integer.MIN_VALUE;
        
        for(int i = 0; i < wallpaper.length; i++) {
            for(int j = 0; j < wallpaper[0].length(); j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    min_x = Math.min(min_x, i);
                    min_y = Math.min(min_y, j);
                    max_x = Math.max(max_x, i);
                    max_y = Math.max(max_y, j);
                }
            }
        }
        
        return new int[] {min_x, min_y, max_x+1, max_y+1};
    }
}