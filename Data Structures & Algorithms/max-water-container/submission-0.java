class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int output=0;
        while(left<right){
            int min=(heights[left]>heights[right]? heights[right] : heights[left]);
            int s = min*(right-left);
            output=(s>output? s : output);

            if(heights[left]>heights[right]){
                right--;
            }else if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
                left++;
            }
        }
        return output;
    }
}
