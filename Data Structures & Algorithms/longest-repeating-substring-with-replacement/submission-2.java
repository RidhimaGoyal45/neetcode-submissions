class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        int maxlen = 0;
        char maxe = ch[0];
        int j=0;
        int len =0;
        for(int i=0;i<ch.length;i++){
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
            if(map.get(ch[i])>maxlen){
                maxlen = map.get(ch[i]);
                maxe = ch[i];
            }
            while(i-j+1-maxlen>k){
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                j++;
            }
            len = Math.max(len,i-j+1);
        }
        return len;
    }
}
