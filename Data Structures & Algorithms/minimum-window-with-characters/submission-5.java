class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i))+1);
            }else{
                map.put(t.charAt(i),1);
            }
        } 
        int count=0;
        int left=0;
        int minLength=s.length();
        int startIndex=-1;
        for(int right=0;right<s.length();right++){
            if(map.containsKey(s.charAt(right))){
                map.put(s.charAt(right),map.get(s.charAt(right))-1);
            }else{
                map.put(s.charAt(right),-1);
            }
            if(map.get(s.charAt(right))>=0) count++;
            if(count==t.length()){
                while(count==t.length()){
                    map.put(s.charAt(left),map.get(s.charAt(left))+1);
                    if(map.get(s.charAt(left))==1){
                        int length = right-left+1;
                        if(length<=minLength){
                            minLength=length;
                            startIndex=left;
                        }
                        count--;
                    }
                    left++;
                }
            }
        }
        if(startIndex==-1) return "";
        return s.substring(startIndex,startIndex+minLength);
    }
}
