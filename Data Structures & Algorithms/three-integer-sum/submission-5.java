class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                if(nums[left]+nums[right]+nums[i]<0){
                    left++;
                }else if(nums[left]+nums[right]+nums[i]>0){
                    right--;
                }else{
                    set.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
