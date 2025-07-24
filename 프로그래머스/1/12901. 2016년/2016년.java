class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] daysOfMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfWeek = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        int sum = 0;
        for(int i = 0; i < a-1; i++) {
            sum += daysOfMonth[i];
        }
        // 1월1일과 a월b일의 일 수 차이
        sum += (b - 1);
        
        // 1월 1일 금요일 -> 5번 인덱스
        answer = dayOfWeek[(sum+5) % 7];
    
        return answer;
    }
}