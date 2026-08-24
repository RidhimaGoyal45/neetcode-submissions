class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String st) {
        // StringBuilder str = new StringBuilder(st);
        List<String> li = new ArrayList<>();
        int start =0;
        int end = 0;
        int i=0;
        while(start<st.length()){
            end = st.indexOf("#",start);
            int size = Integer.parseInt(st.substring(start,end));
            start = end+1;
            li.add(st.substring(start,start+size));
            start = start+size;
        }
        return li;
    }
}
