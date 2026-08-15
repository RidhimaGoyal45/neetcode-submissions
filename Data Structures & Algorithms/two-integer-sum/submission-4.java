class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            map.put(i,nums[i]);
        }
        for(int i=0;i<n;i++){
            // int a = entry.getValue();
            int diff = target-nums[i];
            for(Map.Entry<Integer,Integer> entry: map.entrySet()){
                if(entry.getValue()==diff  && entry.getKey()!=i){
                    return new int[]{i,entry.getKey()};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
