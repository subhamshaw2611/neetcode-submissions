class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        int maxSequence = 0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int sequence = 0;
                int key = nums[i];
                while(set.contains(key)){
                    sequence++;
                    key++;
                }
                maxSequence = (sequence>maxSequence? sequence:maxSequence);
            }
        }
        return maxSequence;
    }
}
