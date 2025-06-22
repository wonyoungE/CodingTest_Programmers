class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length;

        for(int i = 0; i < len - 2; i++) {
            for(int j = i + 1; j < len - 1; j++) {
                for(int k = j + 1; k < len; k++) {
                    boolean isPrime = true;
                    int sum = nums[i] + nums[j] + nums[k];
                    for(int x = 2; x * x <= sum; x++) {
                        if(sum % x == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if(isPrime) {
                        answer++;
                    }
                }
            }
        }
        
        

        return answer;
    }
}