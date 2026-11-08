class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            int[] arr = new int[26];
            String el = strs[i];

            StringBuilder sb = new StringBuilder("");
            for (int j = 0; j < el.length(); j++) {
                int n = el.charAt(j) - 'a';
                arr[n]++;
            }
            for (int num : arr) {
                sb.append(num);
                sb.append('#');
            }
            String key = sb.toString();
            if (map.containsKey(key)) {
                List<String> list2 = map.get(key);
                list2.add(el);
            } else {
                List<String> list = new ArrayList<>(Arrays.asList(el));
                map.put(key, list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
