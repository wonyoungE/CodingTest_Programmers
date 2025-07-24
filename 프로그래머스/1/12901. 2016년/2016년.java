class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] daysOfMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 2016년 시작 요일 -> 금요일
        String[] dayOfWeek = new String[]{"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        int sum = 0;
        for(int i = 0; i < a-1; i++) {
            sum += daysOfMonth[i];
        }
        // 1월1일과 a월b일의 일 수 차이
        sum += (b - 1);
        
        answer = dayOfWeek[sum % 7];
    
        return answer;
    }
}