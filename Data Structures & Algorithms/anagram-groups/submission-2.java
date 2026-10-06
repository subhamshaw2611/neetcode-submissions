class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String el:strs){
            int[] arr = new int[26];
            for(int i=0;i<el.length();i++){
                arr[el.charAt(i)-'a']++;
            }
            String hashKey="";
            for(int i=0;i<arr.length;i++){
                hashKey=hashKey+String.valueOf(arr[i]);
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
