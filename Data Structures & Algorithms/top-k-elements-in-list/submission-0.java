class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int t=k;
        while(k>0){
            int max = 0;
            int max1 = 0;
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue()>max){
                    max = entry.getValue();
                    max1 = entry.getKey();
                }
            }
            map.remove(max1);
            li.add(max1);
            k--;
        }
        int arr[] =  new int[t];
        // int t =0;
        for(int i=0;i<li.size();i++){
            arr[i] = li.get(i);
        }
        return arr;
    }
}
