class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String el:strs){
            int[] arr = new int[26];
            for(int i=0;i<el.length();i++){
                int n = Character.toLowerCase(el.charAt(i))-97;
                arr[n]++;
            }
            StringBuilder sb = new StringBuilder("");
            for(int num:arr){
                sb.append(num);
                sb.append('#');
            }
            String key = sb.toString();
            if(map.containsKey(key)){
               map.get(key).add(el);
            }else{
                map.put(key,new ArrayList<>(List.of(el)));
            }
        }
        return new ArrayList<>(map.values());
    }
}
