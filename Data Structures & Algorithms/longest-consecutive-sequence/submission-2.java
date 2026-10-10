class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        if(nums.length==0) return 0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])) set.add(nums[i]);
        }
        int maxCount=1;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]-1)) continue;
            int val=nums[i]+1;
            int count=1;
            while(set.contains(val)){
                count++;
                maxCount=(count>maxCount?count:maxCount);
                val++;
            }
        }
        return maxCount;
    }
}
