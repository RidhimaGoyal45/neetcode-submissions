class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        int j=0;
        if(strs.isEmpty()){
            return null;
        }
        for(String i:strs){
            if(i.equals("")){
                s.append("%%");
            }
            else{
            s.append(i);
            }
            if(j<strs.size()-1){
                s.append("---");
            }
        }
        String str = s.toString();
        // str = str;
        return str;

    }

    public List<String> decode(String str) {
        if(str==null){
            return new ArrayList<>();
        }
        String s[] = str.split("---");
        List<String> li = new ArrayList<>();
        for(String st:s){
            if(st.equals("%%")){
                li.add("");
            }
            else{
                li.add(st);
            }
        }
        return li;
    }
}
