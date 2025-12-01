import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String, Integer> friend = new HashMap<>();
        
        for(int i = 0; i < friends.length; i++) {
            friend.put(friends[i], i);
        }
        
        int[] giftJisoo = new int[friends.length];
        int[][] giftList = new int[friends.length][friends.length];
        for(int i = 0; i < gifts.length; i++) {
            String[] split = gifts[i].split(" ");
            // 준 선물
            giftJisoo[friend.get(split[0])]++;
            // 받은 선물
            giftJisoo[friend.get(split[1])]--;
            // 누가 누구한테
            giftList[friend.get(split[0])][friend.get(split[1])]++;
        }
        
        for(int i = 0; i < friends.length; i++) {
            int cnt = 0;
            for(int j = 0; j < friends.length; j++) {
                if(i == j) {
                    continue;
                }
                
                // 선물을 받는 경우
                // 더 많이 줬거나, 똑같이 주고 받았는데 지수가 높은 경우
                if(giftList[i][j] > giftList[j][i] ||
                   (giftList[i][j] == giftList[j][i] && giftJisoo[i] > giftJisoo[j])) {
                    cnt++;
                }
            }
            
            answer = Math.max(answer, cnt);
        }
        
        return answer;
    }
}