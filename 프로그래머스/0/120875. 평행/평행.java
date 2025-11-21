class Solution {
    public int solution(int[][] dots) {
        int x1 = dots[0][0], x2 = dots[1][0], x3 = dots[2][0], x4 = dots[3][0];
        int y1 = dots[0][1], y2 = dots[1][1], y3 = dots[2][1], y4 = dots[3][1];
        
        // 기울기 구하기
        // 정수 / 정수 = 정수 이므로 하나를 double형으로 변경
        double slope1 = (double)(y1 - y2) / (x1 - x2);
        double slope2 = (double)(y1 - y3) / (x1 - x3);
        double slope3 = (double)(y1 - y4) / (x1 - x4);
        double slope4 = (double)(y2 - y3) / (x2 - x3);
        double slope5 = (double)(y2 - y4) / (x2 - x4);
        double slope6 = (double)(y3 - y4) / (x3 - x4);
        
        if(slope1 == slope6 || slope2 == slope5 || slope3 == slope4) return 1;
        
        // 두 직선이 겹치는 경우(일치하는 경우) => 어차피 기울기 같음
        
        return 0;
    }
}