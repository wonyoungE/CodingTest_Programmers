class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int column = arr2[0].length;
        
        int[][] answer = new int[row][column];
        
        for(int x = 0; x < row; x++) {
            for(int y = 0; y < column; y++) {
                for(int j = 0; j < arr1[0].length; j++) {
                    answer[x][y] += arr1[x][j] * arr2[j][y];
                }
            }
        }
        
        return answer;
    }
}