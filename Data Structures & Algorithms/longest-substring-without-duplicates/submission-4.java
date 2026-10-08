class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();
        int j =0;
        int max = 0;
        for(int i=0;i<n;i++){
            if(map.containsKey(s.charAt(i))){
                int size = i-j;
                max = Math.max(size,max);
                j = Math.max(map.get(s.charAt(i))+1,j);
            }
            map.put(s.charAt(i),i);
            int size = i-j+1;
            max = Math.max(size,max);
        }
        return max;
    }
}
