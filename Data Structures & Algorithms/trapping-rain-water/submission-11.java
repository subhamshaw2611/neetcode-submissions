class Solution {
    public int trap(int[] height) {
        int totalWater = 0;
        int left = 0;
        // handling LeftSmall & RightBig
        for (int right = 1; right < height.length; right++) {
            if (height[right] >= height[left]) {
                int distance = right - left - 1;
                int water = height[left] * distance;
                left++;
                while (left < right) {
                    water = water - height[left];
                    left++;
                }
                totalWater = totalWater + water;
            }
        }

        int right2 = height.length-1;
        for(int left2=height.length-2;left2>=left;left2--){
            if(height[left2]>=height[right2]){
                int distance = right2 - left2 - 1;
                int water = height[right2] * distance;
                right2--;
                while (right2 > left2) {
                    water = water - height[right2];
                    right2--;
                }
                totalWater = totalWater + water;
            }
        }

        return totalWater;
    }
}
