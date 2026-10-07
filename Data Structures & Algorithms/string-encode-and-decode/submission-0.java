class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder("");
        for(String el:strs){
            for(int i=0;i<el.length();i++){
                sb.append(el.charAt(i));
            }
            sb.append("✓");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='✓'){
                list.add(sb.toString());
                sb.setLength(0);
            }else{
                sb.append(str.charAt(i));
            }
        }
        return list;
    }
}
