class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();

        if(s.length()!=t.length()) return false;

        for(int i=0;i<s.length();i++){
            char el=s.charAt(i);
            if(map.containsKey(el)){
                map.put(el,map.get(el)+1);
            }else{
                map.put(el,1);
            }
        }

        for(int i=0;i<t.length();i++){
            char el=t.charAt(i);
            if(map.containsKey(el)){
                map.put(el,map.get(el)-1);
                if(map.get(el)<0) return false;
            }else{
                return false;
            }
        }
        return true;
    }
}
