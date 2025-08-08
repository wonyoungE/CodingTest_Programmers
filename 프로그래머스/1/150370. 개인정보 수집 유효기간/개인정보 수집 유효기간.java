import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        
        int todayTotalDays = getTotalDays(today);
        
        Map<String, Integer> period = new HashMap<>();
        for(String term : terms) {
            String[] split = term.split(" ");
            period.put(split[0], Integer.parseInt(split[1]));
        }
        
        for(int i = 0; i < privacies.length; i++) {
            // 유효 기간
            int valid = period.get(privacies[i].split(" ")[1]);
            String collectionDate = privacies[i].split(" ")[0];
            
            // 수집일을 일 수로 변환
            int collectionTotalDays = getTotalDays(collectionDate);
            
            // 유효기간 만료일 = 수집일 + 유효기간 - 1
            // 오늘 날짜가 만료일보다 크면 파기
            if(collectionTotalDays + valid * 28 - 1 < todayTotalDays) {
                list.add(i + 1);
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
    
    private int getTotalDays(String dateStr) {
        String[] dateSplit = dateStr.split("\\.");
        int year = Integer.parseInt(dateSplit[0]);
        int month = Integer.parseInt(dateSplit[1]);
        int date = Integer.parseInt(dateSplit[2]);
        
        return year * 12 * 28 + month * 28 + date;
    }
}