class Solution {
    public int removeElement(int[] nums, int val) {
        int count =0;
        int left = 0;
        int n = nums.length;
        int right = n;
        int i=0;
        while(left<right && i<n){
            if(nums[i]!=val){
                nums[left++] = nums[i];
            }
            i++;
        }
        return left;
    }
}