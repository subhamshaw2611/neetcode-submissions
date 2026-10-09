class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                product = product * nums[i];
            }
        }
        int[] arr = new int[nums.length];
        if (zeroCount == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) arr[i] = product;
            }
            return arr;
        } else if (zeroCount == 0) { 
            for (int i = 0; i < nums.length; i++) {
                arr[i] = product / nums[i];
            }
            return arr;
        }
        return arr; // agar zeroCount>1 retrun all zero
    }
}
