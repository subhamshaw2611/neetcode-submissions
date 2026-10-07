class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder("");
        for(String el:strs){
            sb.append(el.length());
            sb.append("#");
            sb.append(el);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#') j++;
            int length=Integer.parseInt(str.substring(i,j));

            list.add(str.substring(j+1,j+length+1));
            i=j+length+1;
        }
        return list;
    }
}
