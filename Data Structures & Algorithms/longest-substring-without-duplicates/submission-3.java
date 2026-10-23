class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxCount=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            if(map.containsKey(s.charAt(right))){
                if(map.get(s.charAt(right))>=left){
                    left = map.get(s.charAt(right))+1;
                }
                map.put(s.charAt(right),right);
                int count=right-left+1;
                maxCount=(count>maxCount? count:maxCount);
                
            }else{
                map.put(s.charAt(right),right);
                int count=right-left+1;
                maxCount=(count>maxCount? count:maxCount);
            }
        }
        return maxCount;
    }
}
