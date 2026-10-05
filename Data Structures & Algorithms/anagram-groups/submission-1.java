class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String el:strs){
            int[] az = new int[26];
            for(int i=0;i<el.length();i++){
                int val=el.charAt(i)-'a';//'a':97
                az[val]++;
            }
            String hashKey = "";
            for(int n:az){
                hashKey=hashKey+String.valueOf(n);
                hashKey=hashKey+'#';
            }
            if(map.containsKey(hashKey)){
                map.get(hashKey).add(el);
            }else{
                List<String> list = new ArrayList<>();
                list.add(el);
                map.put(hashKey,list);
            }
        }
        return new ArrayList(map.values());
    }
}
