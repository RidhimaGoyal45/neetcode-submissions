class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> res = new ArrayList<>();
        int n = nums.length/3;
        for(int i : map.keySet()){
            if(map.get(i)>n){
                res.add(i);
            }
        }
        return res;
    }
}