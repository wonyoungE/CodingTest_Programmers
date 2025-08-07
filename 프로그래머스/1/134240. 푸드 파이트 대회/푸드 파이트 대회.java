class Solution {
    public String solution(int[] food) {
        String p1 = "";
        String p2 = "";
        
        for(int i = 0; i < food.length; i++) {
            int per = food[i] / 2;
            p1 = p1 + String.valueOf(i).repeat(per);
            p2 = String.valueOf(i).repeat(per) + p2;
        }
        
        return p1 + 0 + p2;
    }
}