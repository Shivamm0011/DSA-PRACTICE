class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int sum = 0;
        int min = nums.length + 1;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target) {
                int length = j - i + 1;
                if (length < min) {
                    min = length;
                }
                sum -= nums[i];
                i++;
            }
        } 
        if (min == nums.length + 1) {
            return 0;
        }
        return min;
    }
}                