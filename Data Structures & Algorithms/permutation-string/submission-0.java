class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> s1m = new HashMap<>();
        HashMap<Character,Integer> s2m = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            s1m.put(s1.charAt(i),s1m.getOrDefault(s1.charAt(i),0)+1);
        }
        int j =0;
        for(int i=0;i<s2.length();i++){
            s2m.put(s2.charAt(i),s2m.getOrDefault(s2.charAt(i),0)+1);
            if(s1m.equals(s2m)){
                return true;
            }
            if(i-j+1 == s1.length()){
                s2m.put(s2.charAt(j),s2m.get(s2.charAt(j))-1);
                if(s2m.get(s2.charAt(j))==0){
                    s2m.remove(s2.charAt(j));
                }
                j++;
            }
        }
        return false;
    }
}
