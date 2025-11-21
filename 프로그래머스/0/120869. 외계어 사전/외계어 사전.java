import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        // spell의 원소를 모두 사용해서 만드는 단어
        // dic[]의 원소의 길이 = spell의 길이
        
        Arrays.sort(spell);
        Arrays.sort(dic);
        
        String sorted_spell = String.join("", spell);

        for(int i = 0; i < dic.length; i++) {
            // spell의 길이와 같지 않으면 모두 사용한 것이 아님
            if(spell.length != dic[i].length()) {
                continue;
            }
            
            String[] dic_split = dic[i].split("");
            Arrays.sort(dic_split);
            
            String sorted_dic = String.join("", dic_split); 
            if(sorted_spell.equals(sorted_dic)) {
                return 1;
            }
        }
        
        return 2;
    }
}