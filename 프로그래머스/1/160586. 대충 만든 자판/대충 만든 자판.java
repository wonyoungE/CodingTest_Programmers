class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for(int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int sum = 0;
            for(int j = 0; j < target.length(); j++) {
                int min = 10000;
                char c = target.charAt(j);
                for(int k = 0; k < keymap.length; k++) {
                    String key = keymap[k];
                    if(key.indexOf(c) != -1) {  
                        min = key.indexOf(c) + 1 < min ? key.indexOf(c) + 1 : min;
                    }
                }
                sum += min;
            }
            answer[i] = sum >= 10000 ? -1 : sum;
        }
        
        return answer;
    }
}