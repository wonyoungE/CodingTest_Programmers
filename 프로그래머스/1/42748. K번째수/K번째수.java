import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int answer_idx = 0;
        
        for(int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            int result_idx = commands[i][2];
            
            int[] split = new int[end - start + 1];
            int split_idx = 0;
            
            for(int j = start; j <= end; j++) {
                split[split_idx++] = array[j];
            }
            
            Arrays.sort(split);
            
            answer[answer_idx++] = split[result_idx-1];
        }
        
        return answer;
    }
}