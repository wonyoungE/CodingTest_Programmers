class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] number = {"zero", "one", "two", "three", "four",
                       "five", "six", "seven", "eight", "nine"};
        
        while(s.length() > 0) {
            if(Character.isDigit(s.charAt(0))) {
                sb.append(s.charAt(0));
                s = s.substring(1, s.length());
            } else {
                for(int i = 0; i <= 9; i++) {
                    if(s.startsWith(number[i])) {
                        sb.append(i);
                        s = s.replaceFirst(number[i], "");
                    }
                }
            }
        }
        
        return Integer.parseInt(sb.toString());
    }
}