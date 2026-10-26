class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i),map.get(s1.charAt(i))+1);
            }else{
                map.put(s1.charAt(i),1);
            }
        }
        int winSize = s1.length();
        int left=0;
        int right=winSize-1;
        while(right<s2.length()){
            HashMap<Character,Integer> copy = new HashMap<>(map);
            int count=0;
            for(int i=left;i<=right;i++){
                if(copy.containsKey(s2.charAt(i))){
                    if(copy.get(s2.charAt(i))>0){
                        copy.put(s2.charAt(i),copy.get(s2.charAt(i))-1);
                        count++;
                    }
                }
            }
            if(count==winSize) return true;
            left++;
            right++;
        }
        return false;
    }
}
