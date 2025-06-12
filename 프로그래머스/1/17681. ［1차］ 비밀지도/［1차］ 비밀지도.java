class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++) {
            answer[i] = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i]));
            
            String tmp = "";
            for(int j = 0; j < n; j++) {
                tmp += answer[i].charAt(j) == '1' ? '#' : ' ';
            }
            answer[i] = tmp;
        }
        
        return answer;
    }
}