class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int maxlen = 1;
        int len = 1;
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]==1){
                len++;
            }
            else if(nums[i]-nums[i-1]==0){
                continue;
            }
            else{
                len = 1;
            }
            maxlen = Math.max(maxlen,len);
        }
        return maxlen;
    }
}
