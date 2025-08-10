class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int carpet = brown + yellow;
        
        for(int i = 2; i <= carpet; i++) {
            if(carpet % i == 0) {
                int height = i;
                int width = carpet / i;
                if((height - 2) * (width - 2) == yellow) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }
        }
        return answer;
    }
}