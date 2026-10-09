class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int count = 0;
        int sum = 0;
        int n = nums.length;
        int j = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            count++;
            while(sum >= target) {
                min = Math.min(count, min);
                count--;
                sum -= nums[j];
                j++;
            }
        }
    
    if (min == Integer.MAX_VALUE) {
        return 0;
    }
    return min;
}
}