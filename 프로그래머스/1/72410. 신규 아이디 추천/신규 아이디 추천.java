class Solution {
    public String solution(String new_id) {
        // 1단계
        new_id = new_id.toLowerCase();
        // 2단계
        new_id = new_id.replaceAll("[^a-z0-9\\-\\_\\.]", "");
        // 3단계
        while(new_id.contains("..")) {
            new_id = new_id.replace("..", ".");
        }
        // new_id = new_id.replaceAll("[\\.]{2,}", ".");
        // 4단계
        new_id = new_id.replaceAll("^[\\.]|[\\.]$", "");
        // 5단계
        new_id = new_id.length() == 0 ? "a" : new_id;
        // 6단계
        new_id = new_id.length() >= 16 ? new_id.substring(0, 15).replaceAll("[\\.]$", "") : new_id;
        // 7단계
        while(new_id.length() < 3) {
            new_id += new_id.charAt(new_id.length()-1);
        }
        
        return new_id;
    }
}