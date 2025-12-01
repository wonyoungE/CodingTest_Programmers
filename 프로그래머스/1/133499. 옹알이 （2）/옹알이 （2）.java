class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] list = new String[]{"aya", "ye", "woo", "ma"};
        
        for(String babble : babbling) {
            for(int i = 0; i < list.length; i++) {
                if(babble.contains(list[i] + list[i])) {
                    continue;
                }
                babble = babble.replaceAll(list[i], " ");
            }
            
            if(babble.replaceAll(" ", "").equals("")) {
                answer++;
            }
        }
        
        return answer;
    }
}