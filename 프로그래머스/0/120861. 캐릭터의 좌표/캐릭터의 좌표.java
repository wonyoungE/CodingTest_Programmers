class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x_half = board[0] / 2, y_half = board[1] / 2;
        int x = 0, y = 0;
        
        for(String key : keyinput) {
            if(key.equals("left")) {
                if(x != -x_half) {
                    x--;
                }
            } else if(key.equals("right")) {
                if(x != x_half) {
                    x++;
                }
            } else if(key.equals("up")) {
                if(y != y_half) {
                    y++;
                }
            } else if(key.equals("down")) {
                if(y != -y_half) {
                    y--;
                }
            }
        }
        
        
        return new int[] {x, y};
    }
}