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
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            String numStr=str.substring(i,j);
            int num = Integer.parseInt(numStr);
            String el = str.substring(j+1,j+1+num);
            list.add(el);
            i=j+1+num;
        }
        return list;
    }
}
