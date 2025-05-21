import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String digit = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            if(Character.isDigit(my_string.charAt(i))) {
                digit += my_string.charAt(i);
            }
        }
        
        String[] digit_arr = digit.split("");
        int[] answer = new int[digit_arr.length];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(digit_arr[i]);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}