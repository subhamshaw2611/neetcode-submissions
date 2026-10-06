class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        List<Integer>[] arr = new ArrayList[nums.length];
        for (int el : map.keySet()) {
            int count = map.get(el); // value
            if (arr[count - 1] == null) {
                List<Integer> list = new ArrayList<>();
                list.add(el);
                arr[count - 1] = list;
            } else {
                arr[count - 1].add(el);
            }
        }
        int[] result = new int[k];
        int index = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != null) {
                for (int el : arr[i]) {
                    result[index] = el;
                    index++;
                    if(index==k) return result;
                }
            }
        }

        return result;
    }
}
