class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            }
        }
        int maxCons = 0;
        for (int i = 0; i < nums.length; i++) {
            int cons = 1;
            if (set.contains(nums[i] - 1))  continue;
            int key=nums[i]+1;
            while (set.contains(key)) {
                cons++;
                key++;
            }

            maxCons = (cons > maxCons ? cons : maxCons);
        }
        return maxCons;
    }
}
