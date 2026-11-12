class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int[] arr1 = new int[26]; 
       for(int i=0;i<s1.length();i++){
         arr1[s1.charAt(i)-'a']++;
       }
       int count = 0;
       int[] arr2 = new int[26];
       for(int i=0;i<s2.length();i++){
          if(i>s1.length()-1){
            arr2[s2.charAt(i)-'a']++;
            arr2[s2.charAt(i-s1.length())-'a']--;
            if(Arrays.equals(arr1,arr2)) return true;
          }else{
            arr2[s2.charAt(i)-'a']++;
            if(Arrays.equals(arr1,arr2)) return true;
          }
       }
       return false;
    }
}
