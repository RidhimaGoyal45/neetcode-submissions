class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        int n = s.length();
        for(int i=1;i<strs.length;i++){
            while(!strs[i].contains(s)){
                s = s.substring(0,n-1);
                n = s.length();
                if(n==0){
                    return "";
                }
            }
        }
        return s;
    }
}