class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        // 초기 상태 (0초)
        int skill = bandage[0], per = bandage[1], plus = bandage[2];
        int success = 0;
        int cur_health = health;
        int attack_idx = 0;
        
        for(int i = 1; i <= attacks[attacks.length-1][0]; i++) {
            // 현재 시간이 공격 시간이면
            if(i == attacks[attack_idx][0]) {
                success = 0;
                cur_health -= attacks[attack_idx++][1];
                if(cur_health <= 0) return -1;
            } else {
                // 공격 시간이 아니라면
                cur_health = Math.min(cur_health + per, health);
                // 스킬 연속 시전에 성공하면
                if(++success == skill) {
                    cur_health = Math.min(cur_health + plus, health);                         success = 0;
                }
            }
            
        }
        
        return cur_health;
    }
}