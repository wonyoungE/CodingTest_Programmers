import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
//         Arrays.sort(phone_book);
        
//         for(int i = 1; i < phone_book.length; i++) {
//             if(phone_book[i].startsWith(phone_book[i-1])) {
//                 return false;
//             }
//         }
        
        Map<String, Integer> map = new HashMap<>();
        for(String phone : phone_book) {
            map.put(phone, 0);
        }
        
        for(int i = 0; i < phone_book.length; i++) {
            for(int j = 0; j < phone_book[i].length(); j++) {
                if(map.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }
        
        return true;
    }
}