class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left =0;
        int right = arr.length-k;
        List<Integer> li = new ArrayList<>();
        while(left<right){
            int mid = left + (right-left)/2;
            if(x-arr[mid]>arr[mid+k]-x){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        for(int i=left;i<left+k;i++){
            li.add(arr[i]);
        }
        return li;
    }
}