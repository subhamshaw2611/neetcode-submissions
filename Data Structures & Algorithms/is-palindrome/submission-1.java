class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
        String s2 = s1.toLowerCase();
        int j=s2.length()-1;
        for(int i=0;i<s2.length();i++){
            if(i==j) break;
            if(s2.charAt(i)!=s2.charAt(j)) return false;
            j--;
            
        }
        return true;
    }
}
