import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < moves.length; i++) {
            int column = moves[i]-1;
            for(int j = 0; j < board.length; j++) {
                int doll = board[j][column];
                if(doll != 0) {
                    board[j][column] = 0;
                    if(!stack.isEmpty() && stack.peek() == doll) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(doll);
                    }
                    break;
                }
            }
        }
        
        return answer;
    }
}