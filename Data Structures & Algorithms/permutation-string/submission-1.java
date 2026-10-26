class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;

        int[] s1Freq = new int[26]; 
        for(int i=0;i<s1.length();i++){
            s1Freq[s1.charAt(i)-'a']++;
        }
        int winLen = s1.length();
        for(int left=0;left<=s2.length()-winLen;left++){
            int[] winFreq = new int[26];
            for(int right=left;right<=left+winLen-1;right++){
                winFreq[s2.charAt(right)-'a']++;
            }
            if(Arrays.equals(s1Freq,winFreq)) return true;
        }
        return false;
    }
}
