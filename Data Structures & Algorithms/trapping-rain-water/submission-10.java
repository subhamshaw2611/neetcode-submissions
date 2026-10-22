class Solution {
    public int trap(int[] height) {
        int left=0;
        int totalWater=0;
        for(int right=1;right<height.length;right++){
            if(height[right]>=height[left]){
                int water=height[left]*(right-left-1);
                left++;
                while(left<right){
                    water=water-height[left];
                    left++;
                }
                totalWater=totalWater+water;
            }
        }
        int right=height.length-1;
        for(int right2=height.length-2;right2>=left;right2--){
            if(height[right2]>=height[right]){
                int water=height[right]*(right-right2-1);
                right--;
                while(right2<right){
                    water=water-height[right];
                    right--;
                }
                totalWater=totalWater+water;
            }
        }
        return totalWater;
    }
}
