class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video_len_s = Integer.parseInt(video_len.split(":")[0]) * 60 + Integer.parseInt(video_len.split(":")[1]);
        int pos_s = Integer.parseInt(pos.split(":")[0]) * 60 + Integer.parseInt(pos.split(":")[1]);
        int op_start_s = Integer.parseInt(op_start.split(":")[0]) * 60 + Integer.parseInt(op_start.split(":")[1]);
        int op_end_s = Integer.parseInt(op_end.split(":")[0]) * 60 + Integer.parseInt(op_end.split(":")[1]);
        
        // 오프닝 건너뛰기
        // 시작 위치가 오프닝 구간일 경우
        if(pos_s >= op_start_s && pos_s <= op_end_s) {
                pos_s = op_end_s;
        }
        
        for(String command : commands) {
            if(command.equals("prev")) {
                if(pos_s < 10) {
                    pos_s = 0;
                } else {
                    pos_s -= 10;
                }
            } else if(command.equals("next")) {
                if(pos_s > video_len_s - 10) {
                    pos_s = video_len_s;
                } else {
                    pos_s += 10;
                }
            }
            // 오프닝 건너뛰기
            // 이동한 위치가 오프닝 구간일 경우
            if(pos_s >= op_start_s && pos_s <= op_end_s) {
                pos_s = op_end_s;
            }
        }

        String min = String.format("%2s", String.valueOf(pos_s / 60)).replace(" ", "0");
        String sec = String.format("%2s", String.valueOf(pos_s % 60)).replace(" ", "0");
        
        return min + ":" + sec;
    }
}