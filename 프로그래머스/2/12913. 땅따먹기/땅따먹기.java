class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int len = land.length;
        
        // 아이디어
        // 각 칸까지의 최대값을 저장
        // 마지막 행 중에서 최대값을 리턴
        for(int i = 1; i < len; i++) {
            land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
            land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
            land[i][2] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][3]);
            land[i][3] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][2]);
        }

        return Math.max(Math.max(Math.max(land[len-1][0], land[len-1][1]), land[len-1][2]), land[len-1][3]);
    }
}