class Solution {
    public boolean isAnagram(String s, String t) {
        char[] str1 = s.toCharArray();
        Arrays.sort(str1);
        char[] str2 = t.toCharArray();
        Arrays.sort(str2);
        int n = s.length();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<n;i++){
            if(str1[i]!=str2[i]){
                return false;
            }
        }
        return true;
    }
}
