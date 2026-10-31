class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>=nums[left]){
                if(nums[mid]>=target && nums[left]<=target){
                    right=mid;
                }else{
                    left=mid+1;
                }
            }else{   //nums[mid]<nums[left]
                if(nums[mid]<=target && nums[right]>=target){
                    left=mid;
                }else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}
