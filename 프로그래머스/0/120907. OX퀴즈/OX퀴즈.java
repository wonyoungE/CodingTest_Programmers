class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int idx = 0;
        
        for(String q : quiz) {
            String[] split = q.split(" ");
            String op = split[1];
            int x = Integer.parseInt(split[0]),
                y = Integer.parseInt(split[2]),
                z = Integer.parseInt(split[4]);
            
            if(op.equals("+")) {
                answer[idx++] = z == x + y ? "O" : "X";
            } else if(op.equals("-")) {
                answer[idx++] = z == x - y ? "O" : "X";
            }
        }
        
        return answer;
    }
}