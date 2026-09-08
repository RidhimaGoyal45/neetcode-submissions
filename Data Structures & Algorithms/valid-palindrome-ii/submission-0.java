class Solution {
    public boolean validPalindrome(String s) {
        int low = 0;
        int right = s.length()-1;
        int count = 0;
        while(low<right){
            if(count >1){
                return false;
            }
            if(s.charAt(low)==s.charAt(right)){
                low++;
                right--;
            }
            else{
                if(vp(s,low+1,right)){
                    low++;
                    count++;
                }
                else if(vp(s,low,right-1)){
                    right--;
                    count++;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public boolean vp(String s,int low, int right){
        while(low<right){
            if(s.charAt(low)!=s.charAt(right)){
                return false;
            }
            low++;
            right--;
        }
        return true;
    }
}