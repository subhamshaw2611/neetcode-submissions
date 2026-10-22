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
          if(min==heights[left]){
            left++;
          }else{
            right--;
          }
       }
       return maxWater;
    }
}
