class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for(int i = 0; i < schedules.length; i++) {
            int hour = schedules[i] / 100;
            int min = schedules[i] % 100;

            min += 10;
            if(min >= 60) {
                hour++;
                min %= 60;
            }
            int standard = hour * 60 + min;

            boolean isLate = false;
            for(int j = 0; j < timelogs[0].length; j++) {
                int day = (startday + j) % 7;
                if(day == 6 || day == 0) continue; // 주말

                int log_hour = timelogs[i][j] / 100;
                int log_min = timelogs[i][j] % 100;
                int check = log_hour * 60 + log_min;

                if(check > standard) {
                    isLate = true;
                    break;
                }
            }
            if(!isLate) answer++;
        }

        return answer;
    }
}
