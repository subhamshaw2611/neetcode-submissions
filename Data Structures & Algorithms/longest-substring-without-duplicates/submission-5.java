class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left=0;
        int maxLength=0;
        for(int right=0;right<s.length();right++){
            if(!map.containsKey(s.charAt(right))){
                int length = right-left+1;
                maxLength=(length>maxLength?length:maxLength);
                map.put(s.charAt(right),right);
            }else{
                if(map.get(s.charAt(right))>=left){
                    left=map.get(s.charAt(right))+1;
                }
                map.put(s.charAt(right),right);
                int length = right-left+1;
                maxLength=(length>maxLength?length:maxLength);
            }
        }
        return maxLength;
    }
}
