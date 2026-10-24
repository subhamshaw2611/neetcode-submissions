class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int finalLen = 0;
        int flag=0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < s.length()) {
            if (flag == 0) {
                if (map.containsKey(s.charAt(right))) {
                    map.put(s.charAt(right), map.get(s.charAt(right))+1);
                } else {
                    map.put(s.charAt(right), 1);
                }
            }
            int maxFreq = Collections.max(map.values());
            if ((right - left + 1) - maxFreq <= k) {
                int len = right - left + 1;
                finalLen = (len > finalLen ? len : finalLen);
                right++;
                flag=0;
            } else {
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                left++;
                flag=1;
            }
        }
        return finalLen;
    }
}
