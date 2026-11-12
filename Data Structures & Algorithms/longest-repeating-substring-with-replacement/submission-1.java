class Solution {
    public int characterReplacement(String s, int k) {
       HashMap<Character,Integer> map = new HashMap<>();
       int left = 0;
       int maxLength = 0;
       for(int right=0;right<s.length();right++){
          if(map.containsKey(s.charAt(right))){
              map.put(s.charAt(right),map.get(s.charAt(right))+1);
          }else{
              map.put(s.charAt(right),1);
          }
          int maxFreq = Collections.max(map.values());
          int length = right-left+1;
          while(length-maxFreq>k){
             map.put(s.charAt(left),map.get(s.charAt(left))-1);
             left++;
             maxFreq=Collections.max(map.values());
             length = right-left+1;
          }
          maxLength = (length>maxLength? length:maxLength);
       }
       return maxLength;
    }
}
