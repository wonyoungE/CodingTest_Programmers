class Solution {
    public int solution(String name) {
        int answer = 0;
        
        // 상하 조작 횟수
        int length = name.length();
        for(int i = 0; i < name.length(); i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z'-name.charAt(i)+1);
        }
        
        // 좌우 조작 횟수
        // A를 만났을 때 어떻게?
        // 1. 오른쪽 직진 2. 오른쪽으로 가다가 턴 3. 왼쪽으로 가다가 턴
        
        // A가 아닌 마지막 알파벳 위치 찾기
        // 중간에 A를 만나도 그대로 직진하는 경우 포함
        int lastNonA = length - 1;
        while(lastNonA > 0 && name.charAt(lastNonA) == 'A') {
            lastNonA--;
        }
        // 1. 
        int minMove = lastNonA;
        
        int index;
        for(int i = 0; i < length; i++) {
            index = i + 1;
            // A가 끝날 때까지 index 올리기
            while(index < length && name.charAt(index) == 'A') {
                index++;
            }

            minMove = Math.min(minMove, i * 2 + length - index);
            minMove = Math.min(minMove, (length - index) * 2 + i);
        }
        
        return answer + minMove;
    }
}