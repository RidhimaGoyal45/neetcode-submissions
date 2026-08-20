class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        String[] str = new String[strs.length];
        for(int i=0;i<strs.length;i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            str[i] = new String(arr);
        }
        for(int i=0;i<str.length;i++){
            if(map.containsKey(str[i])){
                map.get(str[i]).add(strs[i]);
            }
            else{
                map.put(str[i],new ArrayList<>());
                map.get(str[i]).add(strs[i]);
            }
        }
        List<List<String>> li = new ArrayList<>();
        for(String s:map.keySet()){
            li.add(map.get(s));
        }
        return li;
    }
}
