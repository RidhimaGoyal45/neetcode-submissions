class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        char[] str = s.toCharArray();
        for(char c:str){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        int low =0;
        int right = sb.length()-1;
        while(low<right){
            if(sb.charAt(low)!=sb.charAt(right)){
                return false;
            }
            right--;
            low++;
        }
        return true;
    }
}
