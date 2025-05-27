class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int k = 0;
        
        for(int i = 0; i < s.length(); i++) {
            int idx = s.substring(0, i).lastIndexOf(String.valueOf(s.charAt(i)));
            if(idx == -1) {
                answer[k++] = idx;
            } else {
                answer[k++] = i - idx;
            }
        }
        
        return answer;
    }
}