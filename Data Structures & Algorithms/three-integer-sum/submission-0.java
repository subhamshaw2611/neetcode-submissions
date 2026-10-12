class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                if(nums[left]+nums[i]+nums[right]<0){
                    left++;
                }else if(nums[left]+nums[i]+nums[right]>0){
                    right--;
                }else{
                    set.add(Arrays.asList(nums[left],nums[i],nums[right]));
                    right--;
                    left++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
