class Solution {
    public int maxArea(int[] heights) {
       int left=0;
       int right=heights.length-1;
       int maxWater=0;
       while(left<right){
          int water=0;
          int min=(heights[left]<heights[right]? heights[left]:heights[right]);
          water=min*(right-left);
          maxWater=(water>maxWater? water:maxWater);
          if(heights[left]>heights[right]){
            right--;
          }else if(heights[left]<heights[right]){
            left++;
          }else{
            left++;
            right--;
          }
       }
       return maxWater;
    }
}
