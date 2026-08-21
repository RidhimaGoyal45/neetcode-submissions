class Solution {
    public static void mergeAndSort(int[] nums,int low,int mid,int high){
        int i=low;
        int j = mid+1;
        int k = 0;
        int[] arr = new int[high-low+1];
        while(i<=mid && j<=high){
            if(nums[i]<nums[j]){
                arr[k++] = nums[i++];
            }
            else{
                arr[k++] = nums[j++];
            }
        }
        while(i<=mid){
            arr[k++] = nums[i++];
        }
        while(j<=high){
            arr[k++] = nums[j++];
        }
        for(int l = 0;l<k;l++){
            nums[l+low] = arr[l];
        }
    }
    public static void merge(int[] nums,int low,int high){
        if(low==high){
            return;
        }
        int mid = low+(high-low)/2;
        merge(nums,low,mid);
        merge(nums,mid+1,high);
        mergeAndSort(nums,low,mid,high);
    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int low =0;
        int high = n-1;
        merge(nums,0,n-1);
        return nums;
    }
}